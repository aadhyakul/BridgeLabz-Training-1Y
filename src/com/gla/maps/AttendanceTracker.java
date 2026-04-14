package com.gla.maps;
import java.util.*;
public class AttendanceTracker {
    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        List<String> students=Arrays.asList("A","B","C","D","E");
        for(String s:students) m.put(s,0);
        List<String> day=Arrays.asList("A","B","C");
        for(String s:day) m.put(s,m.get(s)+1);
        m.forEach((k,v)->{ if(v<1) System.out.println(k);});
    }
}
