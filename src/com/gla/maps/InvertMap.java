package com.gla.maps;
import java.util.*;
public class InvertMap {
    public static <K,V> Map<V,List<K>> invert(Map<K,V> map){
        Map<V,List<K>> res = new HashMap<>();
        for(K k: map.keySet()){
            V v = map.get(k);
            res.computeIfAbsent(v,x->new ArrayList<>()).add(k);
        }
        return res;
    }
    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        m.put("A",1);m.put("B",2);m.put("C",1);
        System.out.println(invert(m));
    }
}
