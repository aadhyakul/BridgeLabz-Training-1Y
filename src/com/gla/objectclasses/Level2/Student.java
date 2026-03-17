package com.gla.objectclasses.Level2;
import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    void displayDetails() {
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name        : ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Marks       : ");
        double marks = sc.nextDouble();

        Student s = new Student(name, rollNumber, marks);
        s.displayDetails();

        sc.close();
    }
}