package com.gla.maps;
import java.util.*;
public class ExamResultsSystem {
    public static void main(String[] args){
        Map<String,Map<String,Integer>> m=new HashMap<>();
        Map<String,Integer> math=new HashMap<>();
        math.put("A",95); math.put("B",80);
        m.put("Math",math);
        System.out.println(m);
    }
}
