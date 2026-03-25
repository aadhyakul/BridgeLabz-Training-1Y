package com.gla.threads;
class TrafficLight implements Runnable {
    public void run() {
        String[] lights = {"RED", "YELLOW", "GREEN"};
        int[] durations = {5000, 2000, 5000};

        try {
            int cycles = 0;
            while (cycles < 2) {
                for (int i = 0; i < lights.length; i++) {
                    System.out.println("Light: " + lights[i] + " (for " + (durations[i] / 1000) + "s)");
                    Thread.sleep(durations[i]);
                }
                cycles++;
            }
            System.out.println("Traffic light simulation complete.");
        } catch (InterruptedException e) {
            System.out.println("Traffic light system stopped.");
        }
    }
}

public class Exmp3_TrafficLight {
    public static void main(String[] args) {
        Thread trafficLight = new Thread(new TrafficLight());
        trafficLight.start();
    }
}