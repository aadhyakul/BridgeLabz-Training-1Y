package com.gla.foodapp;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    static Scanner scanner = new Scanner(System.in);

    static LocalDate takeInput(String label) {
        System.out.print("Enter " + label + " (yyyy-MM-dd): ");
        return LocalDate.parse(scanner.next());
    }

    static void compareDates(LocalDate date1, LocalDate date2) {
        System.out.println("\nDate 1: " + date1);
        System.out.println("Date 2: " + date2);

        if (date1.isBefore(date2)) {
            System.out.println("Result: Date 1 is BEFORE Date 2.");
        } else if (date1.isAfter(date2)) {
            System.out.println("Result: Date 1 is AFTER Date 2.");
        } else {
            System.out.println("Result: Both dates are EQUAL.");
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Date Comparison =====");
        LocalDate date1 = takeInput("first date");
        LocalDate date2 = takeInput("second date");
        compareDates(date1, date2);
    }
}
