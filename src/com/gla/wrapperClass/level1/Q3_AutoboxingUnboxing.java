package com.gla.wrapperClass.level1;

import java.util.ArrayList;

public class Q3_AutoboxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(5);
        int sum = 0;
        for (int val : list) {
            sum += val;
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
