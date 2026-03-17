package com.gla.constructorAccessmod.Level1;
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 50.0;

    CarRental() {
        customerName = "Unknown";
        carModel = "Unknown";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Rahul", "Honda City", 5);
        r1.display();
        r2.display();
    }
}