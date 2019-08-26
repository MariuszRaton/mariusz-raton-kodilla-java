package com.kodilla.good.patterns.food2Door;

public interface Provider {
    String name();
    ProductsOfProvider productsOfProvider(); //= new ProductsOfProvider();
    boolean process(Order order, ProductsOfProvider productsOfProvider);
}
