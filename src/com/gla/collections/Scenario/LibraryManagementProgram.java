package com.gla.collections.Scenario;
import java.util.*;

class BookRecord {
    String name;
    BookRecord(String n){ name=n; }
}

public class LibraryManagementProgram {
    public static void main(String[] args) {

        Queue<BookRecord> queue = new LinkedList<>();
        Stack<BookRecord> stack = new Stack<>();

        BookRecord b = new BookRecord("Java");
        queue.add(b);

        stack.push(queue.poll());

        System.out.println(stack.pop().name);
    }
}