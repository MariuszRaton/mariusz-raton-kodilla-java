package com.kodilla.patterns.Strategy.Social;

public class YGeneration extends User{
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
