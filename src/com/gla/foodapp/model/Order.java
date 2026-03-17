package com.gla.foodapp.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Base abstraction for all order types.
 * Demonstrates inheritance, encapsulation, and runtime polymorphism.
 */
public abstract class Order {

    public static final double DELIVERY_CHARGE = 40.0;

    private final int orderId;
    private double baseAmount;
    private final LocalDateTime orderTime;
    private final List<FoodItem> items;
    private OrderStatus status;
    private String couponCode;
    private double couponDiscount;

    protected Order(int orderId, double baseAmount, LocalDateTime orderTime, List<FoodItem> items) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
        this.orderTime = orderTime;
        this.items = items == null ? new ArrayList<>() : items;
        this.status = OrderStatus.PLACED;
        this.couponCode = "NONE";
        this.couponDiscount = 0.0;
    }

    // Abstract methods — subclasses must override (Polymorphism)
    public abstract double calculateBill();
    protected abstract double getDiscountedAmount();

    public double getTaxAmount() {
        return getTaxableAmount() * 0.05;
    }

    public double getTaxableAmount() {
        return Math.max(0, getDiscountedAmount() - couponDiscount);
    }

    // Getters & Setters
    public int getOrderId()                     { return orderId; }
    public double getBaseAmount()               { return baseAmount; }
    public void setBaseAmount(double a)         { this.baseAmount = a; }
    public LocalDateTime getOrderTime()         { return orderTime; }
    public List<FoodItem> getItems()            { return items; }
    public OrderStatus getStatus()              { return status; }
    public void setStatus(OrderStatus s)        { this.status = s; }
    public String getCouponCode()               { return couponCode; }
    public void setCouponCode(String c)         { this.couponCode = c; }
    public double getCouponDiscount()           { return couponDiscount; }
    public void setCouponDiscount(double d)     { this.couponDiscount = d; }
}
