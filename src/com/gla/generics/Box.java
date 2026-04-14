package com.gla.generics;
public class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(100);
        Box<String> b2 = new Box<>();
        b2.set("Hello");
        Box<Double> b3 = new Box<>();
        b3.set(10.5);

        System.out.println(b1.get());
        System.out.println(b2.get());
        System.out.println(b3.get());
    }
}
