package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        return new OrderRequest(new User("Mateusz" , "Czerw"), LocalDate.now(), "address");
    }
}