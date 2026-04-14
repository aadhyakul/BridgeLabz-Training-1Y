package com.gla.maps;
import java.util.*;
public class CourseRegistration {
    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        m.put("CS101",60);
        m.put("CS101", m.get("CS101")+1);
        m.forEach((k,v)->{
            if(v>=50) System.out.println("Full:"+k);
            if(v<5) System.out.println("Low:"+k);
        });
    }
}
