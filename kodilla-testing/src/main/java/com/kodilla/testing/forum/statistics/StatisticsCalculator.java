package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private int numberOfUsers = 0;
    private int numberOfPosts = 0;
    private int numberOfComments = 0;
    private double averageNumberPostsOfUser;
    private double averageNumberCommentsOfUser;
    private double averageNumberCommentsOfPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberPostsOfUser() {
        return averageNumberPostsOfUser;
    }

    public double getAverageNumberCommentsOfUser() {
        return averageNumberCommentsOfUser;
    }

    public double getAverageNumberCommentsOfPost() {
        return averageNumberCommentsOfPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            averageNumberPostsOfUser = (double) numberOfPosts / (double) numberOfUsers;
            averageNumberCommentsOfUser = (double) numberOfComments / (double) numberOfUsers;
        }
        if (numberOfPosts > 0) {
            averageNumberCommentsOfPost = (double) numberOfComments / (double) numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users " + numberOfUsers);
        System.out.println("Number of posts " + numberOfPosts);
        System.out.println("Number of comments " + numberOfComments);
        System.out.println("Avarage number of Posts per one user " + averageNumberCommentsOfPost);
        System.out.println("Avarage number of Comments per one user " + averageNumberPostsOfUser);
        System.out.println("Avarage number of Comments per one post " + averageNumberCommentsOfUser);
    }
}
