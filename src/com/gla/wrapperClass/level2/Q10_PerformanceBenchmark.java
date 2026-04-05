package com.gla.wrapperClass.level2;

import java.util.ArrayList;

public class Q10_PerformanceBenchmark {
    public static void main(String[] args) {
        int size = 1000000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        long startList = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long sumList = 0;
        for (int val : arrayList) {
            sumList += val;
        }
        long endList = System.currentTimeMillis();

        int[] intArray = new int[size];
        long startArr = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            intArray[i] = i;
        }
        long sumArr = 0;
        for (int val : intArray) {
            sumArr += val;
        }
        long endArr = System.currentTimeMillis();

        System.out.println("ArrayList<Integer> sum: " + sumList + " | Time: " + (endList - startList) + " ms");
        System.out.println("int[] sum: " + sumArr + " | Time: " + (endArr - startArr) + " ms");
    }
}
