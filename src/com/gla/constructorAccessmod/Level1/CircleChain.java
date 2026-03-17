package com.gla.constructorAccessmod.Level1;
public class CircleChain {
    double radius;

    CircleChain() {
        this(1.0);
    }

    CircleChain(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius : " + radius);
        System.out.println("Area   : " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        CircleChain c1 = new CircleChain();
        CircleChain c2 = new CircleChain(7.0);
        c1.display();
        c2.display();
    }
}