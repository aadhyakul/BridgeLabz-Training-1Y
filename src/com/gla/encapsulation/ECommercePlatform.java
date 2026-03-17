package com.gla.encapsulation;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.10; }

    @Override
    public double calculateTax() { return getPrice() * 0.18; }

    @Override
    public String getTaxDetails() { return "Electronics GST: 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.20; }

    @Override
    public double calculateTax() { return getPrice() * 0.05; }

    @Override
    public String getTaxDetails() { return "Clothing GST: 5%"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void printFinalPrice(Product p) {
        double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
        double finalPrice = p.getPrice() + tax - p.calculateDiscount();
        System.out.println(p.getName() + " -> Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product[] products = {
                new Electronics(1, "Laptop", 50000),
                new Clothing(2, "Shirt", 1000),
                new Groceries(3, "Rice", 500)
        };

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}