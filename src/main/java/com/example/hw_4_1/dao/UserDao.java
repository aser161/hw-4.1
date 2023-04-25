package com.example.hw_4_1.dao;

import com.example.hw_4_1.model.User;

import java.util.HashSet;

public interface UserDao {
    User getUserByName(String login);

    HashSet<User> findAllUsers();
}
