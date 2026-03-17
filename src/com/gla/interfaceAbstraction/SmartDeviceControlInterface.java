package com.gla.interfaceAbstraction;
interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC is ON"); }
    public void turnOff() { System.out.println("AC is OFF"); }
}

class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV is ON"); }
    public void turnOff() { System.out.println("TV is OFF"); }
}

public class SmartDeviceControlInterface {
    public static void main(String[] args) {
        SmartDevice[] devices = { new Light(), new AC(), new TV() };
        for (SmartDevice d : devices) {
            d.turnOn();
            d.turnOff();
        }
    }
}