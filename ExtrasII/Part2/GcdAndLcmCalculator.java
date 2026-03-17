package com.gla.foodapp;

import java.util.Scanner;

public class GcdAndLcmCalculator {

    static Scanner scanner = new Scanner(System.in);

    static int[] takeInput() {
        System.out.print("Enter two integers: ");
        return new int[]{scanner.nextInt(), scanner.nextInt()};
    }

    static int calculateGcd(int a, int b) {
        return b == 0 ? a : calculateGcd(b, a % b); // Euclidean algorithm
    }

    static int calculateLcm(int a, int b) {
        return (a / calculateGcd(a, b)) * b;
    }

    static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }

    public static void main(String[] args) {
        System.out.println("===== GCD and LCM Calculator =====");
        int[] nums = takeInput();
        int gcd = calculateGcd(nums[0], nums[1]);
        int lcm = calculateLcm(nums[0], nums[1]);
        displayResult(nums[0], nums[1], gcd, lcm);
    }
}
