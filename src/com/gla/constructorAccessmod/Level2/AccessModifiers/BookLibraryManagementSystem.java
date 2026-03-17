package com.gla.constructorAccessmod.Level2.AccessModifiers;
class LibraryBookRecord {
    public String ISBN;
    protected String title;
    private String author;

    LibraryBookRecord(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void display() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

class DigitalEBookRecord extends LibraryBookRecord {
    String format;

    DigitalEBookRecord(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void display() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + getAuthor());
        System.out.println("Format : " + format);
    }
}

public class BookLibraryManagementSystem {
    public static void main(String[] args) {
        LibraryBookRecord b = new LibraryBookRecord("978-001", "Data Structures", "Mark Allen");
        b.display();
        b.setAuthor("Robert Lafore");
        System.out.println("Updated Author: " + b.getAuthor());

        DigitalEBookRecord eb = new DigitalEBookRecord("978-002", "Clean Code", "Robert Martin", "PDF");
        eb.display();
    }
}