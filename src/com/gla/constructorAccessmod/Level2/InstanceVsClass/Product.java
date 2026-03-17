package com.gla.constructorAccessmod.Level2.InstanceVsClass;
public class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : $" + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products : " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Phone", 499.99);
        Product p3 = new Product("Tablet", 299.99);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}