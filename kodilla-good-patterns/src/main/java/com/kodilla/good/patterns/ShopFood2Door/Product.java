package com.kodilla.good.patterns.ShopFood2Door;

public class Product {
    private  String productName;
    private  Provider provider;
    private Integer productQuantity;

    public Product(String productName, Provider provider, Integer productQuantity) {
        this.productName = productName;
        this.provider = provider;
        this.productQuantity = productQuantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", provider=" + provider +
                '}';
    }
}
