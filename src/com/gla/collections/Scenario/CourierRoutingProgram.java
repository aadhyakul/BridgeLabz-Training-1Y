package com.gla.collections.Scenario;
import java.util.*;

class ParcelRecord implements Comparable<ParcelRecord>{
    int priority;

    ParcelRecord(int p){ priority=p; }

    public int compareTo(ParcelRecord o){
        return o.priority - this.priority;
    }
}

public class CourierRoutingProgram {
    public static void main(String[] args) {

        PriorityQueue<ParcelRecord> pq = new PriorityQueue<>();
        pq.add(new ParcelRecord(5));
        pq.add(new ParcelRecord(2));

        while(!pq.isEmpty()){
            System.out.println(pq.poll().priority);
        }
    }
}