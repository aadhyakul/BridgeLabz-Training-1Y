package com.gla.foodapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class PremiumOrder extends Order {

    public PremiumOrder(int orderId, double baseAmount, LocalDateTime orderTime, List<FoodItem> items) {
        super(orderId, baseAmount, orderTime, items);
    }

    @Override
    protected double getDiscountedAmount() {
        return getBaseAmount() * 0.80; // 20% discount
    }

    @Override
    public double calculateBill() {
        return getTaxableAmount() + getTaxAmount() + DELIVERY_CHARGE;
    }
}
