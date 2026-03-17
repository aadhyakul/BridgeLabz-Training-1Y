package com.gla.javaPackages.Q9_PackageAccessModifierControl.com.access.two;

import com.gla.javaPackages.Q9_PackageAccessModifierControl.com.access.one.Base;

public class Derived extends Base {
    public void testAccess() {
        publicMethod();       // Accessible - public
        protectedMethod();    // Accessible - protected (subclass)
        // defaultMethod();   // NOT accessible - different package
        // privateMethod();   // NOT accessible - private
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.testAccess();

        System.out.println("\n--- Access Modifier Summary Table ---");
        System.out.println("Modifier    | Same Class | Same Package | Subclass | Other Package");
        System.out.println("------------|------------|--------------|----------|---------------");
        System.out.println("private     |    YES     |      NO      |    NO    |      NO");
        System.out.println("default     |    YES     |      YES     |    NO    |      NO");
        System.out.println("protected   |    YES     |      YES     |    YES   |      NO");
        System.out.println("public      |    YES     |      YES     |    YES   |      YES");
    }
}
