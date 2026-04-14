package com.gla.collections.Scenario;
import java.util.*;

public class CustomerFeedbackProgram {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        list.add("Good");
        list.add("Good");

        set.addAll(list);
        queue.addAll(set);

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        System.out.println(stack.pop());
    }
}