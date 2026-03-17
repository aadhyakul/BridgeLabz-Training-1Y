package com.gla.foodapp;

import java.util.Scanner;

public class PalindromeChecker {

    static Scanner scanner = new Scanner(System.in);

    static String takeInput() {
        System.out.print("Enter a string: ");
        return scanner.next().toLowerCase();
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    static void displayResult(String str, boolean result) {
        System.out.println("\"" + str + "\" is " + (result ? "" : "NOT ") + "a palindrome.");
    }

    public static void main(String[] args) {
        System.out.println("===== Palindrome Checker =====");
        String input = takeInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
