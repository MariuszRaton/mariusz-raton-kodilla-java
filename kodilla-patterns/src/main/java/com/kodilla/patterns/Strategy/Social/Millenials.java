package com.kodilla.patterns.Strategy.Social;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
