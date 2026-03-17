package com.gla.foodapp;

import java.util.Scanner;

public class TemperatureConverter {

    static Scanner scanner = new Scanner(System.in);

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static void displayMenu() {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose: ");
    }

    public static void main(String[] args) {
        System.out.println("===== Temperature Converter =====");
        displayMenu();
        int choice = scanner.nextInt();
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            System.out.printf("%.2f°C = %.2f°F%n", temp, celsiusToFahrenheit(temp));
        } else if (choice == 2) {
            System.out.printf("%.2f°F = %.2f°C%n", temp, fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
