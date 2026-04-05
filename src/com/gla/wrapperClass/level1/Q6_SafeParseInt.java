package com.gla.wrapperClass.level1;

public class Q6_SafeParseInt {
    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("\"123\" -> " + safeParseInt("123"));
        System.out.println("\"abc\" -> " + safeParseInt("abc"));
        System.out.println("\"45.6\" -> " + safeParseInt("45.6"));
        System.out.println("\"0\" -> " + safeParseInt("0"));
    }
}
