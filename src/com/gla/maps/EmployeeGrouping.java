package com.gla.maps;
import java.util.*;
class Emp {
    String name, dept;
    Emp(String n,String d){name=n;dept=d;}
    public String toString(){return name;}
}
public class EmployeeGrouping {
    public static void main(String[] args){
        List<Emp> list=Arrays.asList(new Emp("Alice","HR"),new Emp("Bob","IT"),new Emp("Carol","HR"));
        Map<String,List<Emp>> map=new HashMap<>();
        for(Emp e:list){
            map.computeIfAbsent(e.dept,x->new ArrayList<>()).add(e);
        }
        System.out.println(map);
    }
}
