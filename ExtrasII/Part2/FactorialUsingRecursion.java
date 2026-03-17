package com.gla.foodapp;

import java.util.Scanner;

public class FactorialUsingRecursion {

    static Scanner scanner = new Scanner(System.in);

    static int takeInput() {
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }

    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }

    static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " = " + result);
    }

    public static void main(String[] args) {
        System.out.println("===== Factorial Using Recursion =====");
        int n = takeInput();
        long result = calculateFactorial(n);
        displayResult(n, result);
    }
}
