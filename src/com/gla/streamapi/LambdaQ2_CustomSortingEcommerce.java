package com.gla.streamapi;
import java.util.*;

class EcomProductItem {
    String name;
    double price;
    int rating;

    EcomProductItem(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " ₹" + price + " ⭐" + rating;
    }
}

public class LambdaQ2_CustomSortingEcommerce {
    public static void main(String[] args) {
        List<EcomProductItem> products = Arrays.asList(
                new EcomProductItem("Phone", 20000, 4),
                new EcomProductItem("Laptop", 60000, 5),
                new EcomProductItem("Headphones", 2000, 3)
        );

        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sorted by Price: " + products);

        products.sort((a, b) -> b.rating - a.rating);
        System.out.println("Sorted by Rating: " + products);
    }
}