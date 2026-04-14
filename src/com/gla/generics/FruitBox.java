package com.gla.generics;
import java.util.*;

class Fruit { public String toString(){return "Fruit";}}
class Apple extends Fruit { public String toString(){return "Apple";}}
class Mango extends Fruit { public String toString(){return "Mango";}}

public class FruitBox<T extends Fruit> {
    List<T> list = new ArrayList<>();

    void add(T fruit){ list.add(fruit); }
    void display(){ System.out.println(list); }

    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.display();

        // FruitBox<String> wrong = new FruitBox<>(); // compile error
    }
}
