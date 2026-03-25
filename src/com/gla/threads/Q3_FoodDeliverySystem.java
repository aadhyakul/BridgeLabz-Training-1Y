package com.gla.threads;

class Order {
    private int orderID;
    private String restaurantName;
    private int deliveryTimeSeconds;
    private String deliveryType;

    public Order(int orderID, String restaurantName, int deliveryTimeSeconds, String deliveryType) {
        this.orderID = orderID;
        this.restaurantName = restaurantName;
        this.deliveryTimeSeconds = deliveryTimeSeconds;
        this.deliveryType = deliveryType;
    }

    public int getOrderID()             { return orderID; }
    public String getRestaurantName()   { return restaurantName; }
    public int getDeliveryTimeSeconds() { return deliveryTimeSeconds; }
    public String getDeliveryType()     { return deliveryType; }
}

class DeliveryAgent implements Runnable {
    private Order order;

    public DeliveryAgent(Order order) {
        this.order = order;
    }

    public void run() {
        String agent = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();

        System.out.println("[ORDER #" + order.getOrderID() + "] [" + order.getDeliveryType() +
                "] Agent: " + agent + " | Restaurant: " + order.getRestaurantName() +
                " | Priority: " + priority);

        long startTime = System.currentTimeMillis();

        System.out.println("[ORDER #" + order.getOrderID() + "] Status: PICKED UP from " +
                order.getRestaurantName());
        try {
            Thread.sleep((order.getDeliveryTimeSeconds() * 1000L) / 3);
        } catch (InterruptedException e) { return; }

        System.out.println("[ORDER #" + order.getOrderID() + "] Status: IN TRANSIT | Agent: " + agent);
        try {
            Thread.sleep((order.getDeliveryTimeSeconds() * 1000L) * 2 / 3);
        } catch (InterruptedException e) { return; }

        long totalTime = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("[ORDER #" + order.getOrderID() + "] Status: DELIVERED | Agent: " +
                agent + " | Total Time: " + totalTime + "s");
    }
}

public class Q3_FoodDeliverySystem {
    public static void main(String[] args) {
        Order o1 = new Order(101, "Burger King", 2, "Express");
        Order o2 = new Order(102, "Pizza Hut",   5, "Standard");
        Order o3 = new Order(103, "KFC",         2, "Express");
        Order o4 = new Order(104, "Subway",      7, "Economy");
        Order o5 = new Order(105, "Dominos",     4, "Standard");
        Order o6 = new Order(106, "McDonald's",  2, "Express");

        Thread t1 = new Thread(new DeliveryAgent(o1), "Agent-Rahul");
        Thread t2 = new Thread(new DeliveryAgent(o2), "Agent-Sneha");
        Thread t3 = new Thread(new DeliveryAgent(o3), "Agent-Vikram");
        Thread t4 = new Thread(new DeliveryAgent(o4), "Agent-Pooja");
        Thread t5 = new Thread(new DeliveryAgent(o5), "Agent-Amit");
        Thread t6 = new Thread(new DeliveryAgent(o6), "Agent-Kavya");

        t1.setPriority(10); t2.setPriority(5);
        t3.setPriority(10); t4.setPriority(3);
        t5.setPriority(5);  t6.setPriority(10);

        System.out.println("=== Food Delivery System Started ===");
        t4.start(); t2.start(); t5.start();
        t1.start(); t3.start(); t6.start();
    }
}