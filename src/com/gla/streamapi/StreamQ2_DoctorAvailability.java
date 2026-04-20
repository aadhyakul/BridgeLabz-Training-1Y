package com.gla.streamapi;
import java.util.*;

class DoctorItem {
    String name, day, specialty;

    DoctorItem(String name, String day, String specialty) {
        this.name = name;
        this.day = day;
        this.specialty = specialty;
    }
}

public class StreamQ2_DoctorAvailability {
    public static void main(String[] args) {
        List<DoctorItem> doctors = Arrays.asList(
                new DoctorItem("A", "Sunday", "Cardio"),
                new DoctorItem("B", "Monday", "Neuro")
        );

        doctors.stream()
                .filter(d -> d.day.equals("Sunday"))
                .sorted((a, b) -> a.specialty.compareTo(b.specialty))
                .forEach(d -> System.out.println(d.name));
    }
}