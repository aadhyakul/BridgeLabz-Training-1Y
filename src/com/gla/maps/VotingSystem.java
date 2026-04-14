package com.gla.maps;
import java.util.*;
public class VotingSystem {
    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        String[] votes={"A","B","A","C","A","B","C","A","B","A"};
        for(String v:votes){
            m.put(v,m.getOrDefault(v,0)+1);
        }
        System.out.println(m);
        System.out.println(Collections.max(m.entrySet(),Map.Entry.comparingByValue()).getKey());
    }
}
