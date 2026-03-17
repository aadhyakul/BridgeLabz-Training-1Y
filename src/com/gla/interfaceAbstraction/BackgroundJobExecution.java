package com.gla.interfaceAbstraction;
public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job1 = () -> System.out.println("Job 1: Sending email...");
        Runnable job2 = () -> System.out.println("Job 2: Generating report...");
        Runnable job3 = () -> System.out.println("Job 3: Cleaning temp files...");

        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);
        Thread t3 = new Thread(job3);

        t1.start();
        t2.start();
        t3.start();
    }
}