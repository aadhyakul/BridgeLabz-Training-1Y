package com.gla.streamapi;
import java.util.*;

class MovieItem {
    String name;
    double rating;
    int year;

    MovieItem(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String toString() {
        return name + " (" + rating + ")";
    }
}

public class StreamQ1_TopTrendingMovies {
    public static void main(String[] args) {
        List<MovieItem> movies = Arrays.asList(
                new MovieItem("A", 4.5, 2022),
                new MovieItem("B", 4.9, 2023),
                new MovieItem("C", 4.2, 2021),
                new MovieItem("D", 4.8, 2023),
                new MovieItem("E", 4.7, 2022)
        );

        movies.stream()
                .sorted((a, b) -> Double.compare(b.rating, a.rating))
                .limit(5)
                .forEach(System.out::println);
    }
}