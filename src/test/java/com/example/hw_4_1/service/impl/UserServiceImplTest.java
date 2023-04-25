package com.example.hw_4_1.service.impl;

import com.example.hw_4_1.dao.impl.UserDaoImpl;
import com.example.hw_4_1.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserDaoImpl userDao;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void shouldCheckUserExist() {
        HashSet<User> set = new HashSet<>();
        set.add(new User("Bob", "bob@mail.ru"));
        when(userDao.findAllUsers()).thenReturn(set);
        assertTrue(userService.checkUserExist(new User("Bob", "bob@mail.ru")));
    }

    @Test
    void shouldCheckUserNotExist() {
        HashSet<User> set = new HashSet<>();
        set.add(new User("Bob", "bob@mail.ru"));
        when(userDao.findAllUsers()).thenReturn(set);
        assertFalse(userService.checkUserExist(new User("Jim", "jim@mail.ru")));
    }

}