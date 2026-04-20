package com.gla.streamapi;
import java.util.*;
import java.util.stream.*;

class InvoiceRecord {
    String id;
    InvoiceRecord(String id) { this.id = id; }

    public String toString() { return "Invoice: " + id; }
}

public class LambdaQ6_MethodRef_InvoiceCreation {
    public static void main(String[] args) {
        List<String> ids = Arrays.asList("T1", "T2", "T3");

        List<InvoiceRecord> invoices = ids.stream()
                .map(InvoiceRecord::new)
                .collect(Collectors.toList());

        System.out.println(invoices);
    }
}