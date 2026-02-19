package com.gla.string.Level2;

import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int maths=sc.nextInt();
        double total=physics+chemistry+maths;
        double percent=total/3.0;
        String grade;
        if(percent>=90) grade="A";
        else if(percent>=75) grade="B";
        else if(percent>=60) grade="C";
        else if(percent>=40) grade="D";
        else grade="F";
        System.out.println("Percentage: "+percent);
        System.out.println("Grade: "+grade);
    }
}