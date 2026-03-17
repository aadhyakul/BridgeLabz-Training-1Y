package com.gla.objectclasses.Level2;
import java.util.Scanner;

public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome.");
        else
            System.out.println(text + " is not a Palindrome.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker(input);
        pc.displayResult();

        sc.close();
    }
}