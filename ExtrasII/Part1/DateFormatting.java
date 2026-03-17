package com.gla.foodapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    static void displayFormats(LocalDate date) {
        System.out.println("Format 1 (dd/MM/yyyy)      : " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Format 2 (yyyy-MM-dd)      : " + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("Format 3 (EEE, MMM dd yyyy): " + date.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }

    public static void main(String[] args) {
        System.out.println("===== Date Formatting =====");
        LocalDate today = LocalDate.now();
        System.out.println("Current Date in 3 Formats:");
        displayFormats(today);
    }
}
