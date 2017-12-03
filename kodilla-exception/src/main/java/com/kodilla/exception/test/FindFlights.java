package com.kodilla.exception.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlights {
    public boolean findFlight(Flight flight)  throws RouteNotFoundException {
        if (flight != null) {
            Map<String, Boolean> airport = new HashMap<>();
            airport.put("KATL", true);
            airport.put("EGLL", false);
            airport.put("LFPG", true);
            airport.put("OMDB", false);

            List<Boolean> resultList = airport.entrySet().stream()
                    .filter(e -> e.getKey().getArrivalAirport().equals(flight.getArrivalAirport())
                            .map(f -> f.getValue())
                            .collect(Collectors.toList());
            if (resultList.size() > 0) {
                return resultList.get(0);
            } else {
                throw new RouteNotFoundException();
            }
        }
        throw new RouteNotFoundException();
    }
}