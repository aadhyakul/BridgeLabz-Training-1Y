package com.gla.streamapi;
import java.util.*;

public class StreamQ5_TransformNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "bob");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}