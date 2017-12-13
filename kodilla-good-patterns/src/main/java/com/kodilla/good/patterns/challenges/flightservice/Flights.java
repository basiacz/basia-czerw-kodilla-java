package com.kodilla.good.patterns.challenges.flightservice;

import java.util.ArrayList;
import java.util.List;

public class Flights {
    public static List<Flight> getFlights(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("KRK", "KTW"));
        flights.add(new Flight("TTT", "KKK"));
        return flights;
    }
}
