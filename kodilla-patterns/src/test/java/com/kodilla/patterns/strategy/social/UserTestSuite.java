package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam Nowak");
        User john = new YGeneration("John Snow");
        User jan = new ZGeneration("Jan Kowalski");

        //When
        String adamDefaultSocial = adam.social();
        System.out.println("Adam, default social medium: " + adamDefaultSocial);
        String johnDefaultSocial = john.social();
        System.out.println("John, default social medium: " + johnDefaultSocial);
        String janDefaultSocial = jan.social();
        System.out.println("Jan, default social medium: " + janDefaultSocial);

        //Then
        Assert.assertEquals("[FacebookPublisher]", adamDefaultSocial);
        Assert.assertEquals("[TwitterPublisher]", johnDefaultSocial);
        Assert.assertEquals("[SnapchatPublisher]", janDefaultSocial);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        User adam = new Millenials("Adam Nowak");

        //When
        String adamDefaultSocial = adam.social();
        System.out.println("Adam, default social medium: " + adamDefaultSocial);
        adam.setSocialPublisher(new TwitterPublisher());
        adamDefaultSocial = adam.social();
        System.out.println("Adam, new social medium: " + adamDefaultSocial);

        //Then
        Assert.assertEquals("[TwitterPublisher]", adamDefaultSocial);
    }
}
