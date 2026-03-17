package com.gla.constructorAccessmod.Level1;
public class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : $" + price);
        System.out.println("Availability : " + (availability ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java Programming", "James Gosling", 499.99);
        b.display();
        b.borrowBook();
        b.borrowBook();
    }
}