package com.kodilla.spring70.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;

    public ForumUser() {
        this.username =  "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
