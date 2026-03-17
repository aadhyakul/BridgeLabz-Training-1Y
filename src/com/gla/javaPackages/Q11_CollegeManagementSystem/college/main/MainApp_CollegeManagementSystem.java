package com.gla.javaPackages.Q11_CollegeManagementSystem.college.main;

import static java.lang.Math.*;
import com.gla.javaPackages.Q11_CollegeManagementSystem.college.student.Student;
import com.gla.javaPackages.Q11_CollegeManagementSystem.college.faculty.Faculty;
import com.gla.javaPackages.Q11_CollegeManagementSystem.college.department.Department;

public class MainApp_CollegeManagementSystem {
    public static void main(String[] args) {
        System.out.println("========= College Management System =========\n");

        System.out.println("--- Students ---");
        Student s1 = new Student("Amit Kumar", 101, 8.9);
        Student s2 = new Student("Sneha Patel", 102, 9.2);
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

        System.out.println("\n--- Faculty ---");
        Faculty f1 = new Faculty("Dr. Sharma", "Data Structures", "Professor");
        Faculty f2 = new Faculty("Dr. Verma", "Operating Systems", "Assoc. Professor");
        f1.displayDetails();
        System.out.println();
        f2.displayDetails();

        System.out.println("\n--- Department ---");
        Department d = new Department("Computer Science", "Dr. Sharma", 240);
        d.displayDetails();

        System.out.println("\n--- Static Import Demo ---");
        System.out.println("sqrt(81)  = " + sqrt(81));
        System.out.println("pow(2, 8) = " + pow(2, 8));
    }
}
