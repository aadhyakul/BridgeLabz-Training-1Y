package com.gla.wrapperClass.level2;

import java.util.ArrayList;
import java.util.Collections;

public class Q5_EmployeeAgeAnalytics {
    public static void main(String[] args) {
        int[] ages = {29, 45, 33, 60, 24, 41, 52};
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age);
        }
        System.out.println("Youngest employee: " + Collections.min(ageList));
        System.out.println("Oldest employee: " + Collections.max(ageList));
    }
}
