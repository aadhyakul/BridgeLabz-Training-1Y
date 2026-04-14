package com.gla.generics;
public class CompareValues {
    public static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(5,5));
        System.out.println(isEqual("A","B"));
    }
}
