package com.gla.maps;
import java.util.*;
public class SalaryDirectory {
    public static void main(String[] args){
        Map<String,Double> m=new HashMap<>();
        m.put("A",1000.0); m.put("B",2000.0);
        m.put("A", m.get("A")*1.1);
        double avg = m.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println(avg);
    }
}
