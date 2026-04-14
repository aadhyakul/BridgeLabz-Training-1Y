package com.gla.generics;
import java.util.*;

class Electronics {}
class Clothing {}

public class Cart<T> {
    List<T> items = new ArrayList<>();

    void addItem(T item){ items.add(item); }
    void removeItem(T item){ items.remove(item); }
    void displayItems(){ System.out.println(items); }

    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics());

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing());

        eCart.displayItems();
        cCart.displayItems();
    }
}
