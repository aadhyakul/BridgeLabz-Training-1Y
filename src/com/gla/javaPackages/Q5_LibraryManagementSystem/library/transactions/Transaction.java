package com.gla.javaPackages.Q5_LibraryManagementSystem.library.transactions;

import com.gla.javaPackages.Q5_LibraryManagementSystem.library.books.Book;
import com.gla.javaPackages.Q5_LibraryManagementSystem.library.members.Member;

public class Transaction {
    private int transactionId;
    private Book book;
    private Member member;

    public Transaction(int transactionId, Book book, Member member) {
        this.transactionId = transactionId;
        this.book = book;
        this.member = member;
    }

    public void issueBook() {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book '" + book.getTitle() + "' issued to " + member.getName());
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available.");
        }
    }

    public void returnBook() {
        book.setAvailable(true);
        System.out.println("Book '" + book.getTitle() + "' returned by " + member.getName());
    }
}
