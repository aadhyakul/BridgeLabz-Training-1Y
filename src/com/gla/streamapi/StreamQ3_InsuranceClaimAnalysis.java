package com.gla.streamapi;
import java.util.*;
import java.util.stream.*;

class ClaimRecord {
    String type;
    double amount;

    ClaimRecord(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class StreamQ3_InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<ClaimRecord> claims = Arrays.asList(
                new ClaimRecord("Health", 1000),
                new ClaimRecord("Health", 2000),
                new ClaimRecord("Auto", 1500)
        );

        Map<String, Double> result = claims.stream()
                .collect(Collectors.groupingBy(
                        c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)
                ));

        System.out.println(result);
    }
}