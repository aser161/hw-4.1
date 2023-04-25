package com.example.hw_4_1.dao.impl;

import com.example.hw_4_1.dao.UserDao;
import com.example.hw_4_1.model.User;

import java.util.HashSet;

public class UserDaoImpl implements UserDao {
    private HashSet<User> userList = new HashSet<>();

    public UserDaoImpl() {
        userList.add(new User("Bob","bob@mail.ru"));
        userList.add(new User("Bean","bean@mail.ru"));
        userList.add(new User("John","john@mail.ru"));
    }

    @Override
    public User getUserByName(String login){
        for (User user : userList) {
            if (login.equals(user.getLogin())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public HashSet<User> findAllUsers(){
        return userList;
    }
}
