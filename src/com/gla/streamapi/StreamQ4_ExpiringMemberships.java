package com.gla.streamapi;
import java.time.*;
import java.util.*;

class GymMember {
    String name;
    LocalDate expiry;

    GymMember(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }
}

public class StreamQ4_ExpiringMemberships {
    public static void main(String[] args) {
        List<GymMember> members = Arrays.asList(
                new GymMember("A", LocalDate.now().plusDays(10)),
                new GymMember("B", LocalDate.now().plusDays(40))
        );

        members.stream()
                .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
                .forEach(m -> System.out.println(m.name));
    }
}