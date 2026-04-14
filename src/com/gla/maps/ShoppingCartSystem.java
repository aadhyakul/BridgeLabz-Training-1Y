package com.gla.maps;
import java.util.*;
public class ShoppingCartSystem {
    public static void main(String[] args){
        Map<String,Double> m=new LinkedHashMap<>();
        m.put("Phone",3000.0); m.put("Laptop",4000.0);
        double sum= m.values().stream().mapToDouble(Double::doubleValue).sum();
        if(sum>5000) sum*=0.9;
        System.out.println(sum);
    }
}
