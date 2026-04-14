package com.gla.collections.Scenario;
import java.util.*;

class InventoryItem {
    String name;
    int stock;

    InventoryItem(String n,int s){ name=n; stock=s; }
}

public class InventoryRestockProgram {
    public static void main(String[] args) {

        Queue<InventoryItem> queue = new LinkedList<>();
        Stack<InventoryItem> stack = new Stack<>();

        InventoryItem item = new InventoryItem("Milk",2);

        if(item.stock < 5) queue.add(item);

        while(!queue.isEmpty()){
            InventoryItem i = queue.poll();
            i.stock += 10;
            stack.push(i);
        }

        System.out.println(stack.pop().stock);
    }
}