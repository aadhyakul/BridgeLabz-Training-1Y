package com.gla.maps;
import java.util.*;
public class BankSystem {
    public static void main(String[] args){
        Map<String,Double> m=new HashMap<>();
        m.put("A",5000.0);
        m.put("A", m.get("A")+1000);
        System.out.println(m);
    }
}
