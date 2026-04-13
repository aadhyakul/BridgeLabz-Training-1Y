package com.workshop;
import java.util.*;
public class frequencyOfElements {
    public static void main(String[]args){
        int[] arr = {10, 20, 30, 10, 20, 10};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}