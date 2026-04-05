package com.gla.wrapperClass.level1;

public class Q4_WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b: " + (a == b));
        System.out.println("c == d: " + (c == d));
        System.out.println("a.equals(b): " + a.equals(b));

        System.out.println("Java caches Integer objects for values between -128 and 127.");
        System.out.println("So a == b is true because both point to the same cached object.");
        System.out.println("c == d is false because 200 is outside the cache range, creating two separate objects.");
        System.out.println("a.equals(b) is true because equals() compares values, not references.");
    }
}
