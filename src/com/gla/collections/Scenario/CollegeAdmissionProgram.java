package com.gla.collections.Scenario;
import java.util.*;

class StudentRecord implements Comparable<StudentRecord>{
    String name; int marks;

    StudentRecord(String n,int m){ name=n; marks=m; }

    public int compareTo(StudentRecord o){
        return o.marks - this.marks;
    }
}

public class CollegeAdmissionProgram {
    public static void main(String[] args) {

        TreeSet<StudentRecord> merit = new TreeSet<>();
        merit.add(new StudentRecord("A",90));
        merit.add(new StudentRecord("B",80));

        System.out.println(merit);
    }
}