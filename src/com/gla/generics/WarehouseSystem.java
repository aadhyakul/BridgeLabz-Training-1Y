package com.gla.generics;
import java.util.*;

abstract class WarehouseItem { }
class ElectronicsItem extends WarehouseItem { public String toString(){return "Electronics";}}
class GroceryItem extends WarehouseItem { public String toString(){return "Grocery";}}
class FurnitureItem extends WarehouseItem { public String toString(){return "Furniture";}}

class Storage<T extends WarehouseItem>{
    List<T> items = new ArrayList<>();
    void add(T item){ items.add(item); }
}

public class WarehouseSystem {
    static void display(List<? extends WarehouseItem> list){
        System.out.println(list);
    }

    public static void main(String[] args) {
        Storage<ElectronicsItem> s = new Storage<>();
        s.add(new ElectronicsItem());
        display(s.items);
    }
}
