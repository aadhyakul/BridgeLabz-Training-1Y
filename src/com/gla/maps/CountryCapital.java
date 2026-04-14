package com.gla.maps;
import java.util.*;
public class CountryCapital {
    public static void main(String[] args){
        Map<String,String> m=new TreeMap<>();
        m.put("India","Delhi"); m.put("USA","Washington");
        System.out.println(m.getOrDefault("India","Unknown"));
        m.forEach((k,v)->System.out.println(k+":"+v));
    }
}
