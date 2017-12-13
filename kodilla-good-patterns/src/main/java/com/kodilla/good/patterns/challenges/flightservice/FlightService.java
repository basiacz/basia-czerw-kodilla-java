package com.kodilla.good.patterns.challenges.flightservice;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    public List<Flight> getFlightsFrom(String departure){
        return Flights.getFlights().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }
}
