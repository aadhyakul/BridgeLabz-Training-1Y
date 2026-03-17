package com.gla.interfaceAbstraction;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = msg -> msg.length();

        int limit = 20;
        String[] messages = { "Hello", "This is a short msg", "This message is definitely too long to send" };

        for (String msg : messages) {
            int len = getLength.apply(msg);
            if (len > limit) {
                System.out.println("\"" + msg + "\" exceeds limit (" + len + " chars)");
            } else {
                System.out.println("\"" + msg + "\" is within limit (" + len + " chars)");
            }
        }
    }
}