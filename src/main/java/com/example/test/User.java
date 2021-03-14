package com.example.test;

import lombok.Data;

@Data
public class User {

    private String userName;

    private String email;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
}
