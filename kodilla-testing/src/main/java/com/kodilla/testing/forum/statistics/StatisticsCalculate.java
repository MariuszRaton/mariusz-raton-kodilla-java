package com.kodilla.testing.forum.statistics;

public class StatisticsCalculate {
    private int numberUsers = 0;
    private int numberPosts = 0;
    private int numberComments = 0;
    private double averageNumberPostsOfUser;
    private double averageNumberCommentsOfUser;
    private double averageNumberCommentsOfPost;

    public int getNumberUsers() {
        return numberUsers;
    }

    public int getNumberPosts() {
        return numberPosts;
    }

    public int getNumberComments() {
        return numberComments;
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

    public void calculateAdvStatistics(Statistics statistics){
         numberUsers = statistics.usersNames().size();
         numberPosts = statistics.postsCount();
         numberComments = statistics.commentsCount();

        if (numberUsers > 0) {
            averageNumberPostsOfUser = (double) numberPosts / (double) numberUsers;
            averageNumberCommentsOfUser = (double) numberComments / (double) numberUsers;
        }
        if (numberPosts > 0) {
            averageNumberCommentsOfPost = (double) numberComments / (double) numberPosts;
        }
    }

    public void showStatistics(){
        System.out.println("Number of users " + numberUsers);
        System.out.println("Number of posts " + numberPosts);
        System.out.println("Number of comments " + numberComments);
        System.out.println("Avarage number of Posts per one user " + averageNumberCommentsOfPost);
        System.out.println("Avarage number of Comments per one user " + averageNumberPostsOfUser);
        System.out.println("Avarage number of Comments per one post " + averageNumberCommentsOfUser);
    }
}
