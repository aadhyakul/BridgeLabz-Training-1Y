package com.gla.foodapp;

import java.util.Scanner;

public class MaxOfThreeNumbers {

    static Scanner scanner = new Scanner(System.in);

    static int[] takeInput() {
        System.out.print("Enter three integers: ");
        return new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
    }

    static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static void displayResult(int max) {
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        System.out.println("===== Maximum of Three Numbers =====");
        int[] nums = takeInput();
        int max = findMaximum(nums[0], nums[1], nums[2]);
        displayResult(max);
    }
}
