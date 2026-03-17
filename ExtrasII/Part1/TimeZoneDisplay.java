package com.gla.foodapp;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy HH:mm:ss z");

    static void displayTime(String label, String zoneId) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zoneId));
        System.out.println(label + ": " + time.format(formatter));
    }

    public static void main(String[] args) {
        System.out.println("===== Current Time in Different Time Zones =====");
        displayTime("GMT (Greenwich Mean Time)", "GMT");
        displayTime("IST (Indian Standard Time)", "Asia/Kolkata");
        displayTime("PST (Pacific Standard Time)", "America/Los_Angeles");
    }
}
