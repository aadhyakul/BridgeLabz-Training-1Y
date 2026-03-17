package com.gla.javaPackages.Q2_PackageHierarchy.com.university.department.cse;

public class Course {
    private String courseName;
    private int duration;
    private String instructor;

    public Course(String courseName, int duration, String instructor) {
        this.courseName = courseName;
        this.duration = duration;
        this.instructor = instructor;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name  : " + courseName);
        System.out.println("Duration     : " + duration + " months");
        System.out.println("Instructor   : " + instructor);
    }
}
