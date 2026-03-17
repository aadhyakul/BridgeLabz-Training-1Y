package com.gla.encapsulation;
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title +
                ", Author: " + author + ", Loan Duration: " + getLoanDuration() + " days");
    }
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public void reserveItem(String borrower) {
        available = false;
        System.out.println(getTitle() + " reserved by " + borrower);
    }

    @Override
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 7; }

    @Override
    public void reserveItem(String borrower) {
        available = false;
        System.out.println(getTitle() + " reserved by " + borrower);
    }

    @Override
    public boolean checkAvailability() { return available; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 3; }

    @Override
    public void reserveItem(String borrower) {
        available = false;
        System.out.println(getTitle() + " reserved by " + borrower);
    }

    @Override
    public boolean checkAvailability() { return available; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("B001", "Java OOP", "James Gosling"),
                new Magazine("M001", "Tech Today", "Editor"),
                new DVD("D001", "Learn Java", "Trainer")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
        }
    }
}