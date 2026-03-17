package com.gla.interfaceAbstraction;

interface SecurityUtils {
    static String checkPasswordStrength(String password) {
        if (password.length() < 6) {
            return "Weak";
        } else if (password.length() < 10) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String[] passwords = { "abc", "hello123", "MyP@ssw0rd123" };

        for (String pwd : passwords) {
            System.out.println(pwd + " -> " + SecurityUtils.checkPasswordStrength(pwd));
        }
    }
}