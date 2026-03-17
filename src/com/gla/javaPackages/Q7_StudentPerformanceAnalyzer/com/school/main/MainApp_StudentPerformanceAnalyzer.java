package com.gla.javaPackages.Q7_StudentPerformanceAnalyzer.com.school.main;

import com.gla.javaPackages.Q7_StudentPerformanceAnalyzer.com.school.data.*;
import com.gla.javaPackages.Q7_StudentPerformanceAnalyzer.com.school.util.*;

public class MainApp_StudentPerformanceAnalyzer {
    public static void main(String[] args) {
        Student s = new Student("Sneha Gupta", 88, 92, 76);
        Analyzer analyzer = new Analyzer();

        double average = analyzer.calculateAverage(s);
        String grade = analyzer.findGrade(average);

        System.out.println(s.toString());
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
    }
}
