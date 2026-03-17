package com.gla.foodapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class RegularOrder extends Order {

    public RegularOrder(int orderId, double baseAmount, LocalDateTime orderTime, List<FoodItem> items) {
        super(orderId, baseAmount, orderTime, items);
    }

    @Override
    protected double getDiscountedAmount() {
        return getBaseAmount(); // no discount
    }

    @Override
    public double calculateBill() {
        return getTaxableAmount() + getTaxAmount() + DELIVERY_CHARGE;
    }
}
