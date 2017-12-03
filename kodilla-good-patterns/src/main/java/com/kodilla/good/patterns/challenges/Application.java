package com.kodilla.good.patterns.challenges;

public class Application {
    public static void  main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderService orderProcessor = new OrderService(new InformationService(), new OrderRepository());
        orderProcessor.process(orderRequest);
    }
}