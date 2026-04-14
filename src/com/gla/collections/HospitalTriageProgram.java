package com.gla.collections;
import java.util.*;

class TriagePatient implements Comparable<TriagePatient>{
    String name; int severity;
    TriagePatient(String n,int s){name=n;severity=s;}
    public int compareTo(TriagePatient o){return o.severity-this.severity;}
}

public class HospitalTriageProgram {
    public static void main(String[] args) {
        PriorityQueue<TriagePatient> pq = new PriorityQueue<>();
        pq.add(new TriagePatient("John",3));
        pq.add(new TriagePatient("Alice",5));
        pq.add(new TriagePatient("Bob",2));

        while(!pq.isEmpty()) System.out.println(pq.poll().name);
    }
}