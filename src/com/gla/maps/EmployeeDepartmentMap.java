package com.gla.maps;
import java.util.*;
public class EmployeeDepartmentMap {
    public static void main(String[] args){
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"IT"); m.put(2,"HR");
        m.put(1,"Finance");
        System.out.println(m);
    }
}
