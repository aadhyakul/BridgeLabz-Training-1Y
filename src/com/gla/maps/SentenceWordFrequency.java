package com.gla.maps;
import java.util.*;
public class SentenceWordFrequency {
    public static void main(String[] args){
        String s="Java is fun and Java is powerful";
        Map<String,Integer> m=new HashMap<>();
        for(String w:s.toLowerCase().split(" ")){
            m.put(w,m.getOrDefault(w,0)+1);
        }
        System.out.println(m);
    }
}
