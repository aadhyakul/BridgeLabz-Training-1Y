package com.gla.collections;
import java.util.*;

public class CircularBufferProgram {
    public static void main(String[] args) {
        int[] buffer = new int[3];
        int index=0;

        for(int i=1;i<=4;i++){
            buffer[index%3]=i;
            index++;
        }

        System.out.println(Arrays.toString(buffer));
    }
}