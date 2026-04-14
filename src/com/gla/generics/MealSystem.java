package com.gla.generics;

interface MealPlan {}
class VegMeal implements MealPlan {}

class Meal<T extends MealPlan>{
    T plan;
    Meal(T p){ plan = p; }
}

public class MealSystem {
    public static <T extends MealPlan> void generate(T meal){
        System.out.println("Meal generated");
    }

    public static void main(String[] args) {
        generate(new VegMeal());
    }
}
