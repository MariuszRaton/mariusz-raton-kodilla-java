package com.kodilla.good.patterns.ShopFood2Door;

import java.time.LocalDate;
import java.util.Map;

public class Order {
    private Customer customer;
    private LocalDate dateOfOrder;
    public Map<Product, Integer> productList;

    public Order(Customer customer, LocalDate dateOfOrder, Map<Product, Integer> productList) {
        this.customer = customer;
        this.dateOfOrder = dateOfOrder;
        this.productList = productList;
    }

    public Map<Product, Integer> getProductList() {
        return productList;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                '}';
    }
}
