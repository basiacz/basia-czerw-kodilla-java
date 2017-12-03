package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String movieStoreResult = movieStore.getMovies().entrySet().stream()
                .flatMap(f -> f.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(movieStoreResult);
    }
}