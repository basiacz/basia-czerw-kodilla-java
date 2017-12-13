package com.kodilla.good.patterns.challenges.food2door;

import java.util.Random;

public class ExtraFoodShop implements Supplier {

    @Override
    public boolean process(Order order) {
        Random generator = new Random();
        return generator.nextBoolean();
    }

    @Override
    public String getSupplierName() {
        return "ExtraFoodShop";
    }
}
