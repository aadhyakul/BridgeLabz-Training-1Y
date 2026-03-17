package com.gla.javaPackages.Q4_ModularProgramming.collegeinfo.college.student;

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
    }
}
