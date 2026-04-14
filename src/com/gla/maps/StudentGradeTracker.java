package com.gla.maps;
import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args){
        Map<String,Double> m=new TreeMap<>();
        m.put("A",80.0); m.put("B",70.0);
        m.put("A",85.0);
        m.remove("B");
        m.forEach((k,v)->System.out.println(k+":"+v));
    }
}
