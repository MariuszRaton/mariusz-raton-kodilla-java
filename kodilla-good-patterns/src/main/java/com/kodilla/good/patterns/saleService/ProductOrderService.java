package com.kodilla.good.patterns.saleService;

public class ProductOrderService {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        SaleProcessor processor = new SaleProcessor(new EmailService(), new ShopOneService(), new ShopOneDataBase());
        processor.process(order);

    }
}
