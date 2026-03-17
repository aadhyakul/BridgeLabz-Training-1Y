package com.gla.javaPackages.Q11_CollegeManagementSystem.college.faculty;

public class Faculty {
    private String name;
    private String subject;
    private String designation;

    public Faculty(String name, String subject, String designation) {
        this.name = name;
        this.subject = subject;
        this.designation = designation;
    }

    public void displayDetails() {
        System.out.println("Faculty Name  : " + name);
        System.out.println("Subject       : " + subject);
        System.out.println("Designation   : " + designation);
    }
}
