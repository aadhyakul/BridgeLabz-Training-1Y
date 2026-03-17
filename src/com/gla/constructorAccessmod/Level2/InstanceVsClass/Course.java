package com.gla.constructorAccessmod.Level2.InstanceVsClass;
public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Institute    : " + instituteName);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Duration     : " + duration + " months");
        System.out.println("Fee          : $" + fee);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 299.99);
        Course c2 = new Course("Python", 2, 199.99);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Global Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}