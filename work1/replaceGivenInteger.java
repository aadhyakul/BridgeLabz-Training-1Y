package com.workshop;
import java.util.*;
public class replaceGivenInteger {
    public static void main(String[]args){
        int n = 10203040;
        int res = 0, place = 1;

        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) digit = 1;
            res = digit * place + res;
            place *= 10;
            n /= 10;
        }

        System.out.println(res);
    }
}