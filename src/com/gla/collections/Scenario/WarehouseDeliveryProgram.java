package com.gla.collections.Scenario;

import java.util.*;

class WarehousePackage {
    String id;
    WarehousePackage(String i){ id=i; }
}

public class WarehouseDeliveryProgram {
    public static void main(String[] args) {

        Queue<WarehousePackage> queue = new LinkedList<>();
        Set<String> ids = new HashSet<>();

        WarehousePackage p = new WarehousePackage("P1");

        if(ids.add(p.id)) queue.add(p);

        while(!queue.isEmpty()){
            System.out.println("Delivered: "+queue.poll().id);
        }
    }
}