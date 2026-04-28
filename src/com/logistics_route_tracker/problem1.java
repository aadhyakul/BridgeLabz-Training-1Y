package com.logistics_route_tracker;

import java.util.ArrayList;
import java.util.List;

// ---------------- CHECKPOINT ----------------
abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String id, String loc, double dist, int expected, int actual) {
        this.checkpointId = id;
        this.locationName = loc;
        this.distanceFromLast = dist;
        this.expectedDuration = expected;
        this.actualDuration = actual;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}

// ---------------- DELIVERY ----------------
class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    public boolean isCritical() {
        return true;
    }

    public String getType() {
        return "DeliveryCheckpoint";
    }

    public double calculatePenalty() {
        if (isDelayed())
            return (actualDuration - expectedDuration) * 2;
        return 0;
    }
}

// ---------------- FUEL ----------------
class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    public boolean isCritical() {
        return true;
    }

    public String getType() {
        return "FuelCheckpoint";
    }

    public double calculatePenalty() {
        if (isDelayed())
            return 10;
        return 0;
    }
}

// ---------------- REST ----------------
class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    public boolean isCritical() {
        return false;
    }

    public String getType() {
        return "RestCheckpoint";
    }

    public double calculatePenalty() {
        int delay = actualDuration - expectedDuration;
        if (delay > 30)
            return delay * 0.5;
        return 0;
    }
}

// ---------------- ROUTE USING ARRAYLIST ----------------
class RouteTracker {

    private List<Checkpoint> routeList;

    public RouteTracker() {
        routeList = new ArrayList<>();
    }

    // Add
    public void addCheckpoint(Checkpoint checkpoint) {
        routeList.add(checkpoint);
    }

    // Remove
    public boolean removeCheckpoint(String checkpointId) {
        for (Checkpoint cp : routeList) {
            if (cp.checkpointId.equals(checkpointId)) {
                routeList.remove(cp);
                return true;
            }
        }
        return false;
    }

    // Find
    public Checkpoint findCheckpoint(String checkpointId) {
        for (Checkpoint cp : routeList) {
            if (cp.checkpointId.equals(checkpointId))
                return cp;
        }
        return null;
    }

    // Total Distance
    public double computeTotalDistance() {
        double total = 0;
        for (Checkpoint cp : routeList) {
            total += cp.distanceFromLast;
        }
        return total;
    }

    // Total Penalty
    public double computeTotalPenalty() {
        double total = 0;
        for (Checkpoint cp : routeList) {
            total += cp.calculatePenalty();
        }
        return total;
    }

    // Print Route
    public void printRoute() {
        int i = 1;
        for (Checkpoint cp : routeList) {
            String status = cp.isDelayed() ? "Delayed" : "On Time";

            System.out.println(i + ". " + cp.getType() + " – " + cp.locationName +
                    " – " + status + " – Penalty: " + cp.calculatePenalty());
            i++;
        }
    }

    // Consistency Check
    public boolean checkConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        for (Checkpoint cp : routeList) {
            if (cp instanceof DeliveryCheckpoint)
                hasDelivery = true;

            if (cp instanceof FuelCheckpoint)
                hasFuel = true;
        }

        return hasDelivery && hasFuel;
    }
}

// ---------------- DRIVER ----------------
class Driver {
    String driverId;
    String name;
    RouteTracker routeHistory;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new RouteTracker();
    }

    public void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");

        routeHistory.printRoute();

        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);

        if (routeHistory.checkConsistency())
            System.out.println("Critical Route Check: All required checkpoints present");
        else
            System.out.println("Critical Route Check: Missing critical checkpoints");
    }
}

// ---------------- MAIN ----------------
public class problem1 {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 40, 60, 70));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10, 20, 55));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 50, 60, 75));

        d.printSummary();
    }
}