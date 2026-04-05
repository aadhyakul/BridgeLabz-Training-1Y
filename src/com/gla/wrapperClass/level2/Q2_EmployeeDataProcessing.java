package com.gla.wrapperClass.level2;

import java.util.ArrayList;
import java.util.Collections;

public class Q2_EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 42, 31, 55, 22, 38};
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age);
        }
        System.out.println("Youngest employee age: " + Collections.min(ageList));
        System.out.println("Oldest employee age: " + Collections.max(ageList));
    }
}
