package com.kodilla.good.patterns.ShopFood2Door;

public class Product {
    private  String productName;
    private  Provider provider;

    public Product(String productName, Provider provider) {
        this.productName = productName;
        this.provider = provider;
    }

    public Provider getProvider() {
        return provider;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", provider=" + provider +
                '}';
    }
}
