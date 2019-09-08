package com.kodilla.good.patterns.shopFood2Door;

public interface Provider {
   String providerName();
   boolean process(Product product);
}
