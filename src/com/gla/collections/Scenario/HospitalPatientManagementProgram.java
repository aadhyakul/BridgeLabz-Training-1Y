package com.gla.collections.Scenario;

import java.util.*;

class PatientRecord {
    String name;
    PatientRecord(String n){ name=n; }
}

public class HospitalPatientManagementProgram {
    public static void main(String[] args) {

        Queue<PatientRecord> queue = new LinkedList<>();
        Stack<PatientRecord> stack = new Stack<>();

        PatientRecord p = new PatientRecord("A");
        queue.add(p);

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        System.out.println(stack.pop().name);
    }
}