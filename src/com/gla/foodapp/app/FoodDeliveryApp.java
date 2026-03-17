package com.gla.foodapp.app;

import com.gla.foodapp.model.*;
import com.gla.foodapp.service.OrderService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodDeliveryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderService orderService = new OrderService();
        List<Order> orders = new ArrayList<>();
        int orderCounter = 1001;
        int itemCounter = 1;

        while (true) {
            printMenu();
            System.out.print("Choose option: ");
            int choice = readInt(scanner);

            switch (choice) {
                case 1:
                    Order regular = new RegularOrder(orderCounter++, 0, LocalDateTime.now(), new ArrayList<>());
                    orders.add(regular);
                    System.out.println("Regular Order created. ID: " + regular.getOrderId());
                    break;

                case 2:
                    Order premium = new PremiumOrder(orderCounter++, 0, LocalDateTime.now(), new ArrayList<>());
                    orders.add(premium);
                    System.out.println("Premium Order created. ID: " + premium.getOrderId());
                    break;

                case 3:
                    Order addTarget = selectOrder(scanner, orders);
                    if (addTarget == null) break;
                    scanner.nextLine();
                    System.out.print("Item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Item price: ");
                    double price = readDouble(scanner);
                    FoodCategory category = readCategory(scanner);
                    try {
                        orderService.addItemToOrder(addTarget, new FoodItem(itemCounter++, name, price, category));
                        System.out.println("Item added.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    Order removeTarget = selectOrder(scanner, orders);
                    if (removeTarget == null) break;
                    System.out.print("Enter Item ID to remove: ");
                    int removeId = readInt(scanner);
                    System.out.println(orderService.removeItemFromOrder(removeTarget, removeId)
                            ? "Item removed." : "Item not found.");
                    break;

                case 5:
                    Order couponTarget = selectOrder(scanner, orders);
                    if (couponTarget == null) break;
                    scanner.nextLine();
                    System.out.print("Enter coupon (FLAT50 / SAVE10): ");
                    String code = scanner.nextLine();
                    System.out.println(orderService.applyCoupon(couponTarget, code)
                            ? "Coupon applied." : "Invalid coupon.");
                    break;

                case 6:
                    if (orders.isEmpty()) { System.out.println("No orders yet."); break; }
                    viewOrders(scanner, orderService, orders);
                    break;

                case 7:
                    if (orders.isEmpty()) { System.out.println("No orders to process."); break; }
                    orderService.processAllOrders(orders);
                    break;

                case 8:
                    Order statusTarget = selectOrder(scanner, orders);
                    if (statusTarget == null) break;
                    OrderStatus status = readStatus(scanner);
                    orderService.updateOrderStatus(statusTarget, status);
                    System.out.println("Status updated.");
                    break;

                case 9:
                    System.out.printf("Exiting. Total Revenue: %.2f%n", orderService.calculateTotalRevenue(orders));
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Choose 1-9.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== ONLINE FOOD DELIVERY APP =====");
        System.out.println("1. Create Regular Order");
        System.out.println("2. Create Premium Order");
        System.out.println("3. Add Food Item");
        System.out.println("4. Remove Food Item");
        System.out.println("5. Apply Coupon");
        System.out.println("6. View Orders");
        System.out.println("7. Process All Bills (Polymorphism)");
        System.out.println("8. Update Order Status");
        System.out.println("9. Exit");
        System.out.println("=====================================");
    }

    private static Order selectOrder(Scanner scanner, List<Order> orders) {
        if (orders.isEmpty()) { System.out.println("No orders available."); return null; }
        System.out.println("Available Orders:");
        for (Order o : orders)
            System.out.println("  ID: " + o.getOrderId() + " | " + o.getClass().getSimpleName());
        System.out.print("Enter Order ID: ");
        int id = readInt(scanner);
        for (Order o : orders) if (o.getOrderId() == id) return o;
        System.out.println("Order not found.");
        return null;
    }

    private static FoodCategory readCategory(Scanner scanner) {
        FoodCategory[] cats = FoodCategory.values();
        System.out.println("Select Category:");
        for (int i = 0; i < cats.length; i++)
            System.out.println((i + 1) + ". " + cats[i]);
        while (true) {
            System.out.print("Choice: ");
            int c = readInt(scanner);
            if (c >= 1 && c <= cats.length) return cats[c - 1];
            System.out.println("Invalid choice.");
        }
    }

    private static OrderStatus readStatus(Scanner scanner) {
        OrderStatus[] statuses = OrderStatus.values();
        System.out.println("Select Status:");
        for (int i = 0; i < statuses.length; i++)
            System.out.println((i + 1) + ". " + statuses[i]);
        while (true) {
            System.out.print("Choice: ");
            int c = readInt(scanner);
            if (c >= 1 && c <= statuses.length) return statuses[c - 1];
            System.out.println("Invalid choice.");
        }
    }

    private static void viewOrders(Scanner scanner, OrderService orderService, List<Order> orders) {
        System.out.println("1. All Orders  2. Regular Only  3. Premium Only");
        System.out.print("Choice: ");
        int choice = readInt(scanner);
        List<Order> result;
        switch (choice) {
            case 1: result = orders; break;
            case 2: result = orderService.getOrdersByType(orders, RegularOrder.class); break;
            case 3: result = orderService.getOrdersByType(orders, PremiumOrder.class); break;
            default: System.out.println("Invalid."); return;
        }
        if (result.isEmpty()) { System.out.println("No matching orders."); return; }
        for (Order o : result) orderService.printOrderSummary(o);
    }

    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) { System.out.print("Enter a valid number: "); scanner.next(); }
        return scanner.nextInt();
    }

    private static double readDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) { System.out.print("Enter a valid decimal: "); scanner.next(); }
        return scanner.nextDouble();
    }
}
