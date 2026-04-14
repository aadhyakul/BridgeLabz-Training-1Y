package com.gla.generics;

class Category {}
class BookCategory extends Category {}
class ClothingCategory extends Category {}

class Product<T extends Category>{
    double price;
    Product(double p){ price = p; }
}

public class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage){
        System.out.println("Discount applied: "+percentage+"%");
    }

    public static void main(String[] args) {
        Product<BookCategory> p = new Product<>(500);
        applyDiscount(p,10);
    }
}
