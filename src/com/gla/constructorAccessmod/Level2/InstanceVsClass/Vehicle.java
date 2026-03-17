package com.gla.constructorAccessmod.Level2.InstanceVsClass;
public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.00;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : $" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Priya", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(750.00);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}