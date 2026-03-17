package com.gla.interfaceAbstraction;

interface Rentable {
    void rent(String customerName);
    void returnVehicle(String customerName);
}

class Car implements Rentable {
    public void rent(String customerName) {
        System.out.println("Car rented to " + customerName);
    }
    public void returnVehicle(String customerName) {
        System.out.println("Car returned by " + customerName);
    }
}

class Bike implements Rentable {
    public void rent(String customerName) {
        System.out.println("Bike rented to " + customerName);
    }
    public void returnVehicle(String customerName) {
        System.out.println("Bike returned by " + customerName);
    }
}

class Bus implements Rentable {
    public void rent(String customerName) {
        System.out.println("Bus rented to " + customerName);
    }
    public void returnVehicle(String customerName) {
        System.out.println("Bus returned by " + customerName);
    }
}

public class MultiVehicleRentalSystem {
    public static void main(String[] args) {
        Rentable[] vehicles = { new Car(), new Bike(), new Bus() };
        for (Rentable v : vehicles) {
            v.rent("Alice");
            v.returnVehicle("Alice");
        }
    }
}