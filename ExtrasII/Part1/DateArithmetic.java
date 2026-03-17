package com.gla.foodapp;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    static Scanner scanner = new Scanner(System.in);

    static LocalDate takeInput() {
        System.out.print("Enter a date (yyyy-MM-dd): ");
        return LocalDate.parse(scanner.next());
    }

    static LocalDate performArithmetic(LocalDate date) {
        return date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);
    }

    static void displayResult(LocalDate original, LocalDate result) {
        System.out.println("Original Date : " + original);
        System.out.println("After +7 days, +1 month, +2 years, -3 weeks: " + result);
    }

    public static void main(String[] args) {
        System.out.println("===== Date Arithmetic =====");
        LocalDate input = takeInput();
        LocalDate result = performArithmetic(input);
        displayResult(input, result);
    }
}
