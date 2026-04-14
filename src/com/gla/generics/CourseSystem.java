package com.gla.generics;
import java.util.*;

abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}

class Course<T extends CourseType>{}

public class CourseSystem {
    static void handle(List<? extends CourseType> list){
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<ExamCourse> list = Arrays.asList(new ExamCourse());
        handle(list);
    }
}
