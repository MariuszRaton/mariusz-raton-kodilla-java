package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int postsOfPublished;

    public ForumUser(final int userID, final String userName, final char gender, final LocalDate dateOfBirth, final int postsOfPublished) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postsOfPublished = postsOfPublished;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsOfPublished() {
        return postsOfPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postsOfPublished=" + postsOfPublished +
                '}';
    }
}
