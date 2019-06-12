package com.kodilla.patterns.Strategy.Social;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[SnapchatPublisher]";
    }
}
