package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class Prosciutto extends AbstractPizzaOrderDecorator {

    public Prosciutto(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", prosciutto";
    }
}