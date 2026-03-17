package com.gla.interfaceAbstraction;

class ProductPrototype implements Cloneable {
    String name;
    double price;

    ProductPrototype(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public ProductPrototype clone() throws CloneNotSupportedException {
        return (ProductPrototype) super.clone();
    }
}

public class CloningPrototypeObjects {
    public static void main(String[] args) throws Exception {
        ProductPrototype original = new ProductPrototype("Laptop", 75000);
        ProductPrototype cloned = original.clone();

        cloned.name = "Laptop Pro";
        cloned.price = 95000;

        System.out.println("Original: " + original.name + " | " + original.price);
        System.out.println("Cloned  : " + cloned.name + " | " + cloned.price);
    }
}