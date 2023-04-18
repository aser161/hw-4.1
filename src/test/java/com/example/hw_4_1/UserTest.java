package com.example.hw_4_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldCreateUser() {
        User user = new User();
        Assertions.assertEquals(true, user!=null);
    }

    @Test
    void shouldCreateUserParams() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> new User("", ""));
    }

    @Test
    void shouldCheckUserArgs() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> new User("bob", "bobmail.ru"));
    }

    @Test
    void shouldCompareLoginMail() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> new User("bob@mail.ru", "bob@mail.ru"));

    }
}