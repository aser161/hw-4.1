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
        User user = new User("bob", "bob@mail.ru");
        Assertions.assertEquals(true, user.getLogin()!=null&&user.getMail()!=null);
    }

    @Test
    void shouldCheckUserArgs() {
        User user = new User("bob", "bob@mail.ru");
        Assertions.assertEquals(true, user.checkUserArgs());
    }

    @Test
    void shouldCompareLoginMail() {
        User user = new User("bob", "bob@mail.ru");
        Assertions.assertEquals(true, user.compareLoginMail());
    }
}