package com.gla.javaPackages.Q2_PackageHierarchy;

import com.gla.javaPackages.Q2_PackageHierarchy.com.university.department.cse.Course;

public class MainApp_PackageHierarchy {
    public static void main(String[] args) {
        Course c = new Course("Data Structures", 6, "Dr. Verma");
        c.displayCourseDetails();
    }
}
