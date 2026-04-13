package com.workshop;
import java.util.*;
public class rotationOfElements {
    public static void main(String[] args){
        int[] a = {10, 20, 30, 40, 50, 60, 70};
        int k = 3, n = a.length;

        for (int i = 0; i < k; i++) {
            int last = a[n - 1];
            for (int j = n - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }

        for (int x : a) System.out.print(x + " ");
    }
}