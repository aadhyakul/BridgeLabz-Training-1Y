package com.gla.collections;
import java.util.*;

public class StackUsingQueuesProgram {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        q1.add(1); q1.add(2); q1.add(3);

        while(q1.size()>1) q2.add(q1.poll());
        System.out.println(q1.poll());
    }
}