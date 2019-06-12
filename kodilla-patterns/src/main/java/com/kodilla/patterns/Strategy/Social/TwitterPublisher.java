package com.kodilla.patterns.Strategy.Social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[TwitterPublisher]";
    }
}