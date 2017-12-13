package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private Supplier supplier;
    private Order order;

    public OrderProcessor(Supplier supplier, Order order) {
        this.supplier = supplier;
        this.order = order;
    }
    public boolean process(){
        System.out.println("Processing order with " + supplier.getSupplierName());
        boolean result = supplier.process(order);
        if (result) {
            System.out.println("Order processed successfully");
        } else {
            System.out.println("Cannot process order");
        }
        return result;
    }
}