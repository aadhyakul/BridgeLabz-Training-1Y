package com.gla.wrapperClass.level2;

public class Q4_ShoppingCartDoublePrice {
    public static void main(String[] args) {
        String[] prices = {"250.50", "499.99", "99.00", "abc", "150.75"};
        double total = 0;
        for (String price : prices) {
            try {
                total += Double.parseDouble(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price skipped: " + price);
            }
        }
        System.out.println("Total price: " + total);
    }
}
