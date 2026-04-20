package com.gla.streamapi;
import java.util.*;

public class LambdaQ4_MethodRef_PrintIDs {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(101, 102, 103);
        ids.forEach(System.out::println);
    }
}