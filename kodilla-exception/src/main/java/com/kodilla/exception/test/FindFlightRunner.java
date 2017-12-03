package com.kodilla.exception.test;

import java.util.Map;

public class FindFlightRunner {
    public static void main(String[] args) {
        Flight flight  = null;

        FindFlights findFlights = new FindFlights();

        try {
            flight.getArrivalAirport();
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Processing other logic!");
    }
}
