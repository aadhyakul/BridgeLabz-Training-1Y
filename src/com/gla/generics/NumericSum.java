package com.gla.generics;
import java.util.*;

public class NumericSum {
    public static double sumNumbers(List<? extends Number> list){
        double sum = 0;
        for(Number n:list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Double> l2 = Arrays.asList(1.5,2.5);

        System.out.println(sumNumbers(l1));
        System.out.println(sumNumbers(l2));
    }
}
