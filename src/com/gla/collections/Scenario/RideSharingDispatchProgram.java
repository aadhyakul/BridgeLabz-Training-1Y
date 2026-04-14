package com.gla.collections.Scenario;
import java.util.*;

class RideReq implements Comparable<RideReq>{
    int priority;
    RideReq(int p){ priority=p; }

    public int compareTo(RideReq o){
        return o.priority - this.priority;
    }
}

class Driver {
    int id;
    Driver(int i){ id=i; }

    public int hashCode(){ return id; }

    public boolean equals(Object o){
        return (o instanceof Driver) &&
                ((Driver)o).id==this.id;
    }
}

public class RideSharingDispatchProgram {
    public static void main(String[] args) {

        PriorityQueue<RideReq> pq = new PriorityQueue<>();
        pq.add(new RideReq(5));
        pq.add(new RideReq(2));

        while(!pq.isEmpty()){
            System.out.println("Ride assigned priority: "+pq.poll().priority);
        }
    }
}