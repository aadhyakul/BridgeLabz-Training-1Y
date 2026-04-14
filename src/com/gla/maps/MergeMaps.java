package com.gla.maps;
import java.util.*;
public class MergeMaps {
    public static Map<String,Integer> merge(Map<String,Integer> m1, Map<String,Integer> m2){
        Map<String,Integer> res = new HashMap<>(m1);
        for(String k: m2.keySet()){
            res.put(k, res.getOrDefault(k,0)+m2.get(k));
        }
        return res;
    }
    public static void main(String[] args){
        Map<String,Integer> m1=Map.of("A",1,"B",2);
        Map<String,Integer> m2=Map.of("B",3,"C",4);
        System.out.println(merge(m1,m2));
    }
}
