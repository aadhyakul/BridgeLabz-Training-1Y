package com.gla.javaPackages.Q5_LibraryManagementSystem.library.books;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public void displayDetails() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Available : " + (available ? "Yes" : "No"));
    }
}
