package com.gla.interfaceAbstraction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatDDMMYYYY(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    static String formatMMDDYYYY(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    }

    static String formatYYYYMMDD(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println("DD/MM/YYYY : " + DateUtils.formatDDMMYYYY(date));
        System.out.println("MM-DD-YYYY : " + DateUtils.formatMMDDYYYY(date));
        System.out.println("YYYY.MM.DD : " + DateUtils.formatYYYYMMDD(date));
    }
}