package com.gla.maps;
import java.util.*;
public class LibraryCatalog {
    public static void main(String[] args){
        Map<String,String> m=new TreeMap<>();
        m.put("1","Java"); m.put("2","DSA");
        System.out.println(m.getOrDefault("1","Not found"));
        m.remove("2");
        System.out.println(m);
    }
}
