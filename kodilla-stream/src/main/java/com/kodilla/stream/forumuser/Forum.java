package com.kodilla.stream.forumuser;

import java.util.*;

public final class Forum {

    private final List<ForumUser> userList;

    public Forum() {
        userList = new ArrayList<>();
    }

    public List<ForumUser> getList() {

        userList.add(new ForumUser(1, "Jan", 'M', 1990, 1, 2, 3));
        userList.add(new ForumUser(2, "Anna", 'F', 2001, 11, 22, 2));
        userList.add(new ForumUser(3, "Edward", 'M', 1985, 10, 12, 0));
        userList.add(new ForumUser(4, "Adam", 'M', 2016, 11, 01, 5));
        userList.add(new ForumUser(5, "Konrad", 'M', 1985, 04, 24, 2));

        return userList;
    }
}