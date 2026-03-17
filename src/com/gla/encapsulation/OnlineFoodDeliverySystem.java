package com.gla.encapsulation;
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setPrice(double price) { if (price > 0) this.price = price; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Qty: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }

    @Override
    public String getDiscountDetails() { return "Veg Discount: 5%"; }
}

class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge = 50;

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() { return (getPrice() + extraCharge) * getQuantity(); }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.02; }

    @Override
    public String getDiscountDetails() { return "Non-Veg Discount: 2%"; }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        double total = item.calculateTotalPrice();
        double discount = (item instanceof Discountable) ? ((Discountable) item).applyDiscount() : 0;
        System.out.println(item.getItemName() + " -> Final: " + (total - discount));
    }

    public static void main(String[] args) {
        FoodItem[] order = {
                new VegItem("Paneer Tikka", 200, 2),
                new NonVegItem("Chicken Biryani", 300, 1)
        };

        for (FoodItem item : order) {
            processOrder(item);
        }
    }
}