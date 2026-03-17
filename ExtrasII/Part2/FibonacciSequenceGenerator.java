package com.gla.foodapp;

import java.util.Scanner;

public class FibonacciSequenceGenerator {

    static Scanner scanner = new Scanner(System.in);

    static int takeInput() {
        System.out.print("Enter number of terms: ");
        return scanner.nextInt();
    }

    static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + (i < terms - 1 ? ", " : ""));
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("===== Fibonacci Sequence Generator =====");
        int terms = takeInput();
        generateFibonacci(terms);
    }
}
