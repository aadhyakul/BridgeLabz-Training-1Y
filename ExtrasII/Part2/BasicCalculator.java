package com.gla.foodapp;

import java.util.Scanner;

public class BasicCalculator {

    static Scanner scanner = new Scanner(System.in);

    static double add(double a, double b)      { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        return a / b;
    }

    static void displayMenu() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose operation: ");
    }

    static double[] takeInput() {
        System.out.print("Enter two numbers: ");
        return new double[]{scanner.nextDouble(), scanner.nextDouble()};
    }

    public static void main(String[] args) {
        System.out.println("===== Basic Calculator =====");
        displayMenu();
        int choice = scanner.nextInt();
        double[] nums = takeInput();
        double a = nums[0], b = nums[1];
        double result;

        try {
            switch (choice) {
                case 1: result = add(a, b);      System.out.println("Result: " + result); break;
                case 2: result = subtract(a, b); System.out.println("Result: " + result); break;
                case 3: result = multiply(a, b); System.out.println("Result: " + result); break;
                case 4: result = divide(a, b);   System.out.println("Result: " + result); break;
                default: System.out.println("Invalid choice.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
