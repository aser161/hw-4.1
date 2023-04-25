package com.example.hw_4_1.service.impl;

import com.example.hw_4_1.dao.UserDao;
import com.example.hw_4_1.dao.impl.UserDaoImpl;
import com.example.hw_4_1.model.User;
import com.example.hw_4_1.service.UserService;

import java.util.HashSet;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean checkUserExist(User user){
        HashSet<User>users = userDao.findAllUsers();
        for (User user1 : users) {
            if (user1.equals(user)) {
                return true;
            }
        }
        return false;
    }
}
