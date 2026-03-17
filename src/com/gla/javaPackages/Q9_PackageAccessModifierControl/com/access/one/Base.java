package com.gla.javaPackages.Q9_PackageAccessModifierControl.com.access.one;

public class Base {
    public void publicMethod() {
        System.out.println("public method    - accessible everywhere");
    }

    protected void protectedMethod() {
        System.out.println("protected method - accessible in subclass");
    }

    void defaultMethod() {
        System.out.println("default method   - accessible only in same package");
    }

    private void privateMethod() {
        System.out.println("private method   - accessible only in this class");
    }
}
