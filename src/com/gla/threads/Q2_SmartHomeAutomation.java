package com.gla.threads;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class SmartDevice implements Runnable {
    private String deviceName;
    private int intervalSeconds;
    private int cycles;

    public SmartDevice(String deviceName, int intervalSeconds, int cycles) {
        this.deviceName = deviceName;
        this.intervalSeconds = intervalSeconds;
        this.cycles = cycles;
    }

    private String timestamp() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public void run() {
        System.out.println("[" + timestamp() + "] " + deviceName +
                " ONLINE | Priority: " + Thread.currentThread().getPriority());

        for (int i = 1; i <= cycles; i++) {
            System.out.println("[" + timestamp() + "] " + deviceName +
                    " | Cycle " + i + "/" + cycles + " - Status: ACTIVE");
            try {
                Thread.sleep(intervalSeconds * 1000L);
            } catch (InterruptedException e) {
                System.out.println(deviceName + " interrupted.");
                return;
            }
        }
        System.out.println("[" + timestamp() + "] " + deviceName +
                " completed all " + cycles + " cycles. OFFLINE.");
    }
}

public class Q2_SmartHomeAutomation {
    public static void main(String[] args) {
        Thread temperature = new Thread(new SmartDevice("Temperature Sensor", 5, 5));
        Thread security    = new Thread(new SmartDevice("Security Camera",    3, 5));
        Thread light       = new Thread(new SmartDevice("Light Controller",   4, 5));
        Thread door        = new Thread(new SmartDevice("Door Lock Monitor",  6, 5));

        security.setPriority(10);
        temperature.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        security.setName("Security-Thread");
        temperature.setName("Temperature-Thread");
        light.setName("Light-Thread");
        door.setName("Door-Thread");

        System.out.println("=== Smart Home System Starting ===");
        security.start();
        temperature.start();
        light.start();
        door.start();
    }
}