package com.gla.encapsulation;
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name +
                ", Age: " + age + ", Bill: " + calculateBill());
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double ratePerDay;
    private java.util.List<String> records = new java.util.ArrayList<>();

    public InPatient(int id, String name, int age, int days, double rate) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.ratePerDay = rate;
    }

    @Override
    public double calculateBill() { return daysAdmitted * ratePerDay; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println("Records: " + records); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private java.util.List<String> records = new java.util.ArrayList<>();

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println("Records: " + records); }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
                new InPatient(1, "Alice", 35, 5, 2000),
                new OutPatient(2, "Bob", 28, 500)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
        }
    }
}