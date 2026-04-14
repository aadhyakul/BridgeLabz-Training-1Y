package com.gla.collections;
import java.util.*;

public class ReverseQueueProgram {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        Stack<Integer> stack = new Stack<>();

        while(!q.isEmpty()) stack.push(q.poll());
        while(!stack.isEmpty()) q.offer(stack.pop());

        System.out.println(q);
    }
}