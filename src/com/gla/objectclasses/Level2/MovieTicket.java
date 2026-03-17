package com.gla.objectclasses.Level2;
import java.util.Scanner;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0;
        this.price = 0.0;
    }

    void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void displayDetails() {
        System.out.println("Movie Name  : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price       : $" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name  : ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number : ");
        int seat = sc.nextInt();

        System.out.print("Enter Price       : ");
        double price = sc.nextDouble();

        MovieTicket ticket = new MovieTicket(movie);
        ticket.bookTicket(seat, price);
        ticket.displayDetails();

        sc.close();
    }
}