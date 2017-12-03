package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRepository {
    public void createOrder(User user, LocalDate when, String to) {
        System.out.println("Creating order.");
    }
}