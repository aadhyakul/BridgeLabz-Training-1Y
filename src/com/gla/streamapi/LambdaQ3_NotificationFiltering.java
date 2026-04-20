package com.gla.streamapi;
import java.util.*;
import java.util.function.Predicate;

public class LambdaQ3_NotificationFiltering {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("critical", "normal", "emergency");

        Predicate<String> filter = a -> a.equals("critical") || a.equals("emergency");

        alerts.stream().filter(filter).forEach(System.out::println);
    }
}