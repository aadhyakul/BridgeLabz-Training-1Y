package com.gla.objectclasses.Level2;
import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " item(s) added. New quantity: " + quantity);
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed. New quantity: " + quantity);
        } else {
            System.out.println("Not enough items in cart!");
        }
    }

    double totalCost() {
        return price * quantity;
    }

    void displayTotalCost() {
        System.out.println("Item     : " + itemName);
        System.out.println("Price    : $" + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : $" + totalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name  : ");
        String name = sc.nextLine();

        System.out.print("Enter Price      : ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity   : ");
        int qty = sc.nextInt();

        CartItem cart = new CartItem(name, price, qty);

        System.out.print("Add how many items? ");
        cart.addItem(sc.nextInt());

        System.out.print("Remove how many items? ");
        cart.removeItem(sc.nextInt());

        cart.displayTotalCost();

        sc.close();
    }
}