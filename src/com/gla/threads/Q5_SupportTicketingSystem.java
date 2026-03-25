package com.gla.threads;

import java.util.*;

class SupportTicket extends Thread {
    private int ticketNumber;
    private String ticketType;
    private long processingTimeMs;
    private long startTime;
    private long endTime;

    private static final Random random = new Random();

    public SupportTicket(int ticketNumber, String ticketType, int priority) {
        this.ticketNumber = ticketNumber;
        this.ticketType = ticketType;
        this.processingTimeMs = (1 + random.nextInt(5)) * 1000L;
        this.setName("Agent-" + String.format("%02d", ticketNumber));
        this.setPriority(priority);
    }

    public int getTicketNumber()  { return ticketNumber; }
    public String getTicketType() { return ticketType; }
    public long getTotalTime()    { return endTime - startTime; }

    public void run() {
        startTime = System.currentTimeMillis();
        System.out.println("[TICKET #" + ticketNumber + "] Type: " + ticketType +
                " | Agent: " + getName() + " | Priority: " + getPriority() +
                " | Est. Time: " + (processingTimeMs / 1000) + "s | STATUS: PROCESSING STARTED");
        try {
            Thread.sleep(processingTimeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();
        System.out.println("[TICKET #" + ticketNumber + "] Type: " + ticketType +
                " | Agent: " + getName() + " | Total Time: " +
                ((endTime - startTime) / 1000) + "s | STATUS: COMPLETED");
    }
}

public class Q5_SupportTicketingSystem {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Customer Support Ticketing System ===\n");

        SupportTicket[] tickets = {
                new SupportTicket(1,  "Critical Bug",     10),
                new SupportTicket(2,  "General Query",     2),
                new SupportTicket(3,  "Feature Request",   4),
                new SupportTicket(4,  "Critical Bug",     10),
                new SupportTicket(5,  "Feedback",          1),
                new SupportTicket(6,  "General Query",     2),
                new SupportTicket(7,  "Critical Bug",     10),
                new SupportTicket(8,  "Feature Request",   4),
                new SupportTicket(9,  "Feedback",          1),
                new SupportTicket(10, "General Query",     2)
        };

        List<SupportTicket> sorted = new ArrayList<>(Arrays.asList(tickets));
        sorted.sort((a, b) -> b.getPriority() - a.getPriority());
        System.out.println("--- Queue (sorted by priority) ---");
        for (int i = 0; i < sorted.size(); i++) {
            System.out.println("Queue #" + (i + 1) + " -> Ticket #" +
                    sorted.get(i).getTicketNumber() + " [" + sorted.get(i).getTicketType() +
                    "] Priority: " + sorted.get(i).getPriority());
        }
        System.out.println();

        for (SupportTicket t : tickets) t.start();
        for (SupportTicket t : tickets) t.join();

        System.out.println("\n=== Statistics: Avg Processing Time Per Type ===");
        Map<String, Long> totalTime = new HashMap<>();
        Map<String, Integer> count  = new HashMap<>();
        for (SupportTicket t : tickets) {
            totalTime.merge(t.getTicketType(), t.getTotalTime(), Long::sum);
            count.merge(t.getTicketType(), 1, Integer::sum);
        }
        for (String type : totalTime.keySet()) {
            double avg = (double) totalTime.get(type) / (count.get(type) * 1000);
            System.out.printf("%-20s | Tickets: %d | Avg Time: %.2f seconds%n",
                    type, count.get(type), avg);
        }
        System.out.println("\n=== All tickets resolved. ===");
    }
}