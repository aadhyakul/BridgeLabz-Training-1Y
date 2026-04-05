package com.gla.wrapperClass.level1;

public class Q2_WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 45.67;
        double d = obj.doubleValue();
        int i = (int) obj.doubleValue();
        System.out.println("Double value: " + d);
        System.out.println("Int value (cast): " + i);
    }
}
