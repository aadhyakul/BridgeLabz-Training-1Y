package com.workshop;
import java.util.*;
public class friendlyPair {
    public static void main(String[]args){
        int a = 6, b = 28;

        int sum1 = 0, sum2 = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) sum1 += i;
        }

        for (int i = 1; i < b; i++) {
            if (b % i == 0) sum2 += i;
        }

        if ((float)sum1 / a == (float)sum2 / b)
            System.out.println("Yes, they are a friendly pair");
        else
            System.out.println("No, they are not a friendly pair");
    }
}

