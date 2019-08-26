package com.kodilla.good.patterns.ShopFood2Door;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Customer customer = new Customer("Adam");
        Product product1 = new Product("product1", new ExtraFoodShop());
        Product product2 = new Product("product2", new ExtraFoodShop());
        Product product3 = new Product("product3", new HealthyShop());
        Product product4 = new Product("product4", new HealthyShop());
        Product product5 = new Product("product5", new GlutenFreeShop());

        Map<Product, Integer> map = new HashMap<>();
        map.put(product1, 1);
        map.put(product2, 0);
        map.put(product3, 4);
        map.put(product4, 2);
        map.put(product5, 1);

        Order order = new Order(customer, LocalDate.of(2019, 12, 18), map);

        SaleProcessor saleProcessor = new SaleProcessor(order);
        saleProcessor.sale();

    }
}
