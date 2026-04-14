package com.gla.generics;
import java.util.*;

class Products {
    double price;
    Products(double p){ price = p; }
    double getPrice(){ return price; }
}
class Mobile extends Products { Mobile(double p){super(p);} }
class Laptop extends Products { Laptop(double p){super(p);} }

public class PriceCalculatorss {
    public static double calculateTotal(List<? extends Products> items){
        double sum = 0;
        for(Products p:items){
            sum += p.getPrice();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Mobile> m = Arrays.asList(new Mobile(10000), new Mobile(20000));
        System.out.println(calculateTotal(m));
    }
}
