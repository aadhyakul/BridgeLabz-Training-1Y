package com.gla.wrapperClass.level1;

import java.util.Scanner;

public class Q1_PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primitive = sc.nextInt();
        Integer obj = Integer.valueOf(primitive);
        System.out.println("Primitive value: " + primitive);
        System.out.println("Wrapper object value: " + obj);
        sc.close();
    }
}
