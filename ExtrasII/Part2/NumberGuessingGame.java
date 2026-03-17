package com.gla.foodapp;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    static int generateGuess(int low, int high) {
        return (low + high) / 2; // binary search style guess
    }

    static String getUserFeedback(int guess) {
        System.out.print("Computer guessed: " + guess + ". Is it (H)igh, (L)ow, or (C)orrect? ");
        return scanner.next().trim().toUpperCase();
    }

    static void playGame() {
        int low = 1, high = 100;
        System.out.println("Think of a number between 1 and 100. Press Enter when ready.");
        scanner.nextLine();

        while (true) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(guess);

            switch (feedback) {
                case "C":
                    System.out.println("Got it! The number was " + guess + ".");
                    return;
                case "H":
                    high = guess - 1;
                    break;
                case "L":
                    low = guess + 1;
                    break;
                default:
                    System.out.println("Invalid input. Enter H, L, or C.");
            }

            if (low > high) {
                System.out.println("Something went wrong — are you cheating?");
                return;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Number Guessing Game =====");
        playGame();
    }
}
