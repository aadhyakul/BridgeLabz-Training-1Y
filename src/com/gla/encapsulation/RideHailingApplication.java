package com.gla.encapsulation;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("ID: " + vehicleId + ", Driver: " + driverName +
                ", Rate/km: " + ratePerKm);
    }
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance + 50; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance + 10; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance + 20; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("C01", "Ravi", 15),
                new Bike("B01", "Suresh", 8),
                new Auto("A01", "Mohan", 10)
        };

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for 10km: " + v.calculateFare(10));
        }
    }
}