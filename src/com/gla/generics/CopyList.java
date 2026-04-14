package com.gla.generics;
import java.util.*;

public class CopyList {
    public static void copyList(List<? super Number> dest, List<? extends Number> src){
        for(Number n:src){
            dest.add(n);
        }
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(1,2,3);

        copyList(dest,src);
        System.out.println(dest);
    }
}
