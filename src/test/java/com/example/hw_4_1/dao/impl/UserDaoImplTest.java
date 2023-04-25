package com.example.hw_4_1.dao.impl;

import com.example.hw_4_1.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {

    @Test
    void shouldGetUserByName() {
        User bob = new User("Bob", "bob@mail.ru");
        assertEquals(bob, new UserDaoImpl().getUserByName("Bob"));
    }

    @Test
    void shouldGetNullByName() {
        assertNull(new UserDaoImpl().getUserByName("Jim"));
    }

}

