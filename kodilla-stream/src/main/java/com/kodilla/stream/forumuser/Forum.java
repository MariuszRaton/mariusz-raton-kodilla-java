package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.*;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(001, "Jan", 'M', LocalDate.of(1990,01, 02), 3));
        userList.add(new ForumUser(002, "Anna", 'F', LocalDate.of(2001,11, 22), 2));
        userList.add(new ForumUser(003, "Edward", 'M', LocalDate.of(1985,10, 12), 0));
        userList.add(new ForumUser(004, "Adam", 'M', LocalDate.of(2016,11, 01), 5));

    }
    public List<ForumUser> getList() {
        return new ArrayList<>(userList);
    }

}
