package com.gla.maps;
import java.util.*;
public class WebsiteTracker {
    public static void main(String[] args){
        String[] pages={"home","about","home","contact"};
        Map<String,Integer> m=new HashMap<>();
        for(String p:pages) m.put(p,m.getOrDefault(p,0)+1);
        System.out.println(m);
    }
}
