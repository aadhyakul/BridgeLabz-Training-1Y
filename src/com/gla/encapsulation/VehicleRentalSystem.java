package com.gla.encapsulation;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return getRentalRate() * 0.10; }

    @Override
    public String getInsuranceDetails() { return "Car Insurance: 10% of rental rate"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; }

    @Override
    public double calculateInsurance() { return getRentalRate() * 0.05; }

    @Override
    public String getInsuranceDetails() { return "Bike Insurance: 5% of rental rate"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }

    @Override
    public double calculateInsurance() { return getRentalRate() * 0.15; }

    @Override
    public String getInsuranceDetails() { return "Truck Insurance: 15% of rental rate"; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("CAR001", 1000),
                new Bike("BIKE001", 500),
                new Truck("TRUCK001", 2000)
        };

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " Rental (3 days): " + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
            }
        }
    }
}