package com.gla.maps;
import java.util.*;
public class WordFrequencyCounter {
    public static Map<String,Integer> count(String text){
        Map<String,Integer> map = new HashMap<>();
        text = text.toLowerCase().replaceAll("[^a-z ]","");
        for(String w: text.split("\s+")){
            if(w.isEmpty()) continue;
            map.put(w, map.getOrDefault(w,0)+1);
        }
        return map;
    }
    public static void main(String[] args){
        System.out.println(count("Hello world, hello Java!"));
    }
}
