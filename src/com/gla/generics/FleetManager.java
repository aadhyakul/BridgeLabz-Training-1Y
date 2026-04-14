package com.gla.generics;
import java.util.*;

class Vehicle { public String toString(){return "Vehicle";}}
class Truck extends Vehicle { public String toString(){return "Truck";}}
class Bike extends Vehicle { public String toString(){return "Bike";}}

public class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();

    void addVehicle(T v){ fleet.add(v); }
    void showFleet(){ System.out.println(fleet); }

    public static void main(String[] args) {
        FleetManager<Truck> t = new FleetManager<>();
        t.addVehicle(new Truck());

        FleetManager<Bike> b = new FleetManager<>();
        b.addVehicle(new Bike());

        t.showFleet();
        b.showFleet();
    }
}
