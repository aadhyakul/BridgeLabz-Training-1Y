package com.gla.threads;

class ExamActivity implements Runnable {
    private String activityName;
    private int durationSeconds;
    private int cycleCount;

    public ExamActivity(String activityName, int durationSeconds, int cycleCount) {
        this.activityName = activityName;
        this.durationSeconds = durationSeconds;
        this.cycleCount = cycleCount;
    }

    public void run() {
        System.out.println("[STATE: RUNNING] " + activityName +
                " started | Priority: " + Thread.currentThread().getPriority());

        for (int i = 1; i <= cycleCount; i++) {
            System.out.println("[" + activityName + "] Cycle " + i + "/" + cycleCount + " in progress...");
            try {
                Thread.sleep(durationSeconds * 1000L);
            } catch (InterruptedException e) {
                System.out.println("[STATE: TERMINATED] " + activityName + " interrupted.");
                return;
            }
        }
        System.out.println("[STATE: TERMINATED] " + activityName + " completed.");
    }
}

class StudentEntry implements Runnable {
    private volatile boolean running = true;

    public void stopEntry() { running = false; }

    public void run() {
        int count = 0;
        System.out.println("[STATE: RUNNING] Student Entry Monitoring started | Priority: " +
                Thread.currentThread().getPriority());
        while (running) {
            count++;
            System.out.println("[Student Entry] Student #" + count + " entered the hall.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("[STATE: TERMINATED] Student Entry closed. Total students: " + count);
    }
}

public class Q4_ExamHallManagement {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Exam Hall Management System Started ===");

        StudentEntry entryTask      = new StudentEntry();
        Thread entryThread          = new Thread(entryTask,  "EntryMonitor-Thread");
        Thread qPaperThread         = new Thread(new ExamActivity("Question Paper Distribution", 2, 3), "QPaper-Thread");
        Thread attendanceThread     = new Thread(new ExamActivity("Attendance Marking",          2, 4), "Attendance-Thread");
        Thread collectionThread     = new Thread(new ExamActivity("Answer Sheet Collection",     2, 3), "Collection-Thread");

        entryThread.setPriority(5);
        qPaperThread.setPriority(10);
        attendanceThread.setPriority(8);
        collectionThread.setPriority(7);

        entryThread.start();

        Thread.sleep(5000);
        System.out.println("\n[STATE: NEW -> RUNNABLE] Starting Question Paper Distribution...");
        qPaperThread.start();

        Thread.sleep(5000);
        System.out.println("\n[STATE: NEW -> RUNNABLE] Starting Attendance Marking...");
        attendanceThread.start();

        qPaperThread.join();
        attendanceThread.join();

        System.out.println("\n[STATE: NEW -> RUNNABLE] Starting Answer Sheet Collection...");
        collectionThread.start();
        collectionThread.join();

        entryTask.stopEntry();
        entryThread.interrupt();

        System.out.println("\n=== All Exam Hall Activities Completed ===");
    }
}
