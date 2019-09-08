package com.kodilla.good.patterns.shopFood2Door;

public class Product {

    private  String productName;
    private Integer productQuantity;
    private Provider provider;

    public Product(String productName, Integer productQuantity, Provider provider) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.provider = provider;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public Provider getProvider() {
        return provider;
    }
}
