package com.gla.wrapperClass.level2;

import java.util.ArrayList;
import java.util.Objects;

public class Q7_ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {4, 3, 5, 2};
        ArrayList<Integer> wrapperRatings = new ArrayList<>();
        wrapperRatings.add(5);
        wrapperRatings.add(null);
        wrapperRatings.add(3);
        wrapperRatings.add(null);
        wrapperRatings.add(4);

        ArrayList<Integer> allRatings = new ArrayList<>();
        for (int r : primitiveRatings) {
            allRatings.add(r);
        }
        for (Integer r : wrapperRatings) {
            if (Objects.nonNull(r)) {
                allRatings.add(r);
            }
        }

        int sum = 0;
        for (int r : allRatings) {
            sum += r;
        }
        double average = (double) sum / allRatings.size();
        System.out.println("Total valid ratings: " + allRatings.size());
        System.out.println("Average rating: " + average);
    }
}
