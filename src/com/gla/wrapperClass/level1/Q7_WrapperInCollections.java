package com.gla.wrapperClass.level1;

import java.util.ArrayList;
import java.util.Collections;

public class Q7_WrapperInCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();
        for (double price : prices) {
            list.add(price);
        }
        double highest = Collections.max(list);
        double sum = 0;
        for (double val : list) {
            sum += val;
        }
        double average = sum / list.size();
        System.out.println("Highest price: " + highest);
        System.out.println("Average price: " + average);
    }
}
