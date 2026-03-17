package com.gla.javaPackages.Q11_CollegeManagementSystem.college.student;

public class Student {
    private String name;
    private int rollNumber;
    private double cgpa;

    public Student(String name, int rollNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
    }

    public void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("CGPA         : " + cgpa);
    }
}
