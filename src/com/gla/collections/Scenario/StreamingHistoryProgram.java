package com.gla.collections.Scenario;
import java.util.*;

class MovieRecord {
    String name, genre;

    MovieRecord(String n,String g){ name=n; genre=g; }
}

public class StreamingHistoryProgram {
    public static void main(String[] args) {

        Stack<MovieRecord> stack = new Stack<>();
        Set<String> genres = new HashSet<>();

        MovieRecord m = new MovieRecord("M1","Action");

        stack.push(m);
        genres.add(m.genre);

        System.out.println(genres);
    }
}