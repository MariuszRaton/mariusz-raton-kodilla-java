package com.kodilla.stream.forumuser;

import java.util.*;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(001, "Jan", 'M', 1990, 01, 02, 3));
        userList.add(new ForumUser(002, "Anna", 'F', 2001, 11, 22, 2));
        userList.add(new ForumUser(003, "Edward", 'M', 1985, 10, 12, 0));
        userList.add(new ForumUser(004, "Adam", 'M', 2016, 11, 01, 5));
        userList.add(new ForumUser(005, "Konrad", 'M', 1985, 04, 24, 2));
    }

    public List<ForumUser> getList() {
        return userList;
    }
}
