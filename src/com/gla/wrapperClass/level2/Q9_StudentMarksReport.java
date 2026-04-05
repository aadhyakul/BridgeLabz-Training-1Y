package com.gla.wrapperClass.level2;

import java.util.ArrayList;

public class Q9_StudentMarksReport {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc", null, "72"};
        ArrayList<Integer> validMarks = new ArrayList<>();
        for (Object input : inputs) {
            if (input == null) {
                continue;
            }
            try {
                validMarks.add(Integer.parseInt(input.toString()));
            } catch (NumberFormatException e) {
            }
        }
        int sum = 0;
        for (int mark : validMarks) {
            sum += mark;
        }
        double average = (double) sum / validMarks.size();
        System.out.println("Valid marks: " + validMarks);
        System.out.println("Average marks: " + average);
    }
}
