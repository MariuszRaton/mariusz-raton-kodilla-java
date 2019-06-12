package com.kodilla.patterns.Strategy.Social;

public class ZGeneration extends User{
    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}