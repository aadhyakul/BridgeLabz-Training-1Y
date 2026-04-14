package com.gla.maps;
import java.util.*;
public class InventorySystem {
    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        m.put("Pen",10);
        m.put("Pen", m.get("Pen")-5);
        m.put("Pen", m.get("Pen")+20);
        System.out.println(m.getOrDefault("Pen",0));
    }
}
