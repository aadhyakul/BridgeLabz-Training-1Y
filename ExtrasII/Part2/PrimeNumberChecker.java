package com.gla.foodapp;

import java.util.Scanner;

public class PrimeNumberChecker {

    static Scanner scanner = new Scanner(System.in);

    static int takeInput() {
        System.out.print("Enter a number to check: ");
        return scanner.nextInt();
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void displayResult(int n, boolean prime) {
        System.out.println(n + (prime ? " is a Prime number." : " is NOT a Prime number."));
    }

    public static void main(String[] args) {
        System.out.println("===== Prime Number Checker =====");
        int n = takeInput();
        boolean result = isPrime(n);
        displayResult(n, result);
    }
}
