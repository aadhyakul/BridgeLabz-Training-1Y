package com.gla.javaPackages.Q1_UserDefinedPackages;

import com.gla.javaPackages.Q1_UserDefinedPackages.college.student.Student;
import com.gla.javaPackages.Q1_UserDefinedPackages.college.faculty.Faculty;

public class Main_UserDefinedPackages {
    public static void main(String[] args) {
        Student s = new Student("Amit Kumar", 101);
        s.displayDetails();

        System.out.println();

        Faculty f = new Faculty("Dr. Sharma", "Mathematics");
        f.displayDetails();
    }
}
