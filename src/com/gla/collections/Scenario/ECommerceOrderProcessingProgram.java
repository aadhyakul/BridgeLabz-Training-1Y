package com.gla.collections.Scenario;
import java.util.*;

class EcommerceOrder {
    int id;
    EcommerceOrder(int i){ id=i; }

    public int hashCode(){ return id; }

    public boolean equals(Object o){
        return (o instanceof EcommerceOrder) &&
                ((EcommerceOrder)o).id==this.id;
    }
}

public class ECommerceOrderProcessingProgram {
    public static void main(String[] args) {

        List<EcommerceOrder> list = new ArrayList<>();
        list.add(new EcommerceOrder(1));
        list.add(new EcommerceOrder(2));
        list.add(new EcommerceOrder(1));

        Set<EcommerceOrder> unique = new HashSet<>(list);
        Queue<EcommerceOrder> queue = new LinkedList<>(unique);
        Stack<EcommerceOrder> failed = new Stack<>();

        while(!queue.isEmpty()){
            EcommerceOrder o = queue.poll();
            if(o.id % 2 == 0) failed.push(o);
            else System.out.println("Processed: "+o.id);
        }

        while(!failed.isEmpty()){
            System.out.println("Retry: "+failed.pop().id);
        }
    }
}