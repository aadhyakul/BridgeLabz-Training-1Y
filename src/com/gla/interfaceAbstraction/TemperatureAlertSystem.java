package com.gla.interfaceAbstraction;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> isOverheated = temp -> temp > 37.5;

        double[] temperatures = { 36.0, 37.5, 38.2, 40.0, 35.5 };

        for (double temp : temperatures) {
            if (isOverheated.test(temp)) {
                System.out.println("ALERT! High temperature: " + temp);
            } else {
                System.out.println("Normal temperature: " + temp);
            }
        }
    }
}