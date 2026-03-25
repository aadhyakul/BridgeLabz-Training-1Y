package com.gla.threads;

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(taskName + " started with priority: " +
                Thread.currentThread().getPriority());
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " - Step " + i);
        }
        System.out.println(taskName + " completed.");
    }
}

public class Exmp4_TaskPriority {
    public static void main(String[] args) {
        Thread low    = new Thread(new Task("Low Priority Task"));
        Thread normal = new Thread(new Task("Normal Priority Task"));
        Thread high   = new Thread(new Task("High Priority Task"));

        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();
    }
}