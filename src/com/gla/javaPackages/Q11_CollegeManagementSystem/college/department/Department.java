package com.gla.javaPackages.Q11_CollegeManagementSystem.college.department;

public class Department {
    private String departmentName;
    private String hodName;
    private int totalStudents;

    public Department(String departmentName, String hodName, int totalStudents) {
        this.departmentName = departmentName;
        this.hodName = hodName;
        this.totalStudents = totalStudents;
    }

    public void displayDetails() {
        System.out.println("Department      : " + departmentName);
        System.out.println("HOD             : " + hodName);
        System.out.println("Total Students  : " + totalStudents);
    }
}
