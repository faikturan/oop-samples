package org.example.sample1.service;

import org.example.sample1.model.User;

public class UserService {
    private static final User[] users = new User[]{
            new User("ali@ali.com","1234"),
            new User("ayse@ayse.com","1234"),
    };

    public User findByEmail(String email){
        return null;
    }
}

