package com.gla.javaPackages.Q5_LibraryManagementSystem;

import com.gla.javaPackages.Q5_LibraryManagementSystem.library.books.Book;
import com.gla.javaPackages.Q5_LibraryManagementSystem.library.members.Member;
import com.gla.javaPackages.Q5_LibraryManagementSystem.library.transactions.Transaction;

public class Main_LibraryManagementSystem {
    public static void main(String[] args) {
        Book b = new Book(1, "Java Programming", "James Gosling");
        System.out.println("--- New Book Added ---");
        b.displayDetails();

        Member m = new Member(101, "Amit Kumar", "amit@gla.ac.in");
        System.out.println("\n--- New Member Registered ---");
        m.displayDetails();

        Transaction t = new Transaction(1001, b, m);
        System.out.println("\n--- Issue Book ---");
        t.issueBook();

        System.out.println("\n--- Return Book ---");
        t.returnBook();
    }
}
