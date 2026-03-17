package com.gla.interfaceAbstraction;

interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery display not available for this vehicle");
    }
}

class PetrolCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Petrol Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric Car speed: 100 km/h");
    }

    public void displayBattery() {
        System.out.println("Electric Car battery: 75%");
    }
}

class ElectricBike implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric Bike speed: 60 km/h");
    }

    public void displayBattery() {
        System.out.println("Electric Bike battery: 50%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new PetrolCar(), new ElectricCar(), new ElectricBike() };

        for (Vehicle v : vehicles) {
            v.displaySpeed();
            v.displayBattery();
        }
    }
}