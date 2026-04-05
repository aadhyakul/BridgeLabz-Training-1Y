package com.gla.wrapperClass.level2;

public class Q3_UserInputValidation {
    public static boolean isValidAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("\"25\" -> " + isValidAge("25"));
        System.out.println("\"15\" -> " + isValidAge("15"));
        System.out.println("\"abc\" -> " + isValidAge("abc"));
        System.out.println("\"18\" -> " + isValidAge("18"));
    }
}
