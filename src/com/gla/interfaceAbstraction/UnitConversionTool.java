package com.gla.interfaceAbstraction;

interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}

public class UnitConversionTool {
    public static void main(String[] args) {
        System.out.println("100 km = " + UnitConverter.kmToMiles(100) + " miles");
        System.out.println("62 miles = " + UnitConverter.milesToKm(62) + " km");
        System.out.println("75 kg = " + UnitConverter.kgToLbs(75) + " lbs");
        System.out.println("165 lbs = " + UnitConverter.lbsToKg(165) + " kg");
    }
}