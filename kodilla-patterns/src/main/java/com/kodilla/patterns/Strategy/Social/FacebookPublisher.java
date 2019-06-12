package com.kodilla.patterns.Strategy.Social;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[FacebookPublisher]";
    }
}
