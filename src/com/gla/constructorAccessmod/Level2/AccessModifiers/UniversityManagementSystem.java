package com.gla.constructorAccessmod.Level2.AccessModifiers;
class UniversityStudent {
    public int rollNumber;
    protected String name;
    private double CGPA;

    UniversityStudent(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void display() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
    }
}

class PostgraduateResearchStudent extends UniversityStudent {
    String researchTopic;

    PostgraduateResearchStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    void display() {
        System.out.println("Roll Number     : " + rollNumber);
        System.out.println("Name            : " + name);
        System.out.println("CGPA            : " + getCGPA());
        System.out.println("Research Topic  : " + researchTopic);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        UniversityStudent s = new UniversityStudent(101, "Amit", 8.5);
        s.display();
        s.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s.getCGPA());

        PostgraduateResearchStudent pg = new PostgraduateResearchStudent(201, "Sneha", 9.2, "AI & ML");
        pg.display();
    }
}