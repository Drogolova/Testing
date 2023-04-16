package com.example.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.AfterTestClass;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldCheckUserCreation() {
        Assertions.assertThrows(NullPointerException.class, () -> new User(null, null));
    }

    @Test
    void shouldCheckEmptyUserCreation() {
        User user = new User();
        assertNull(user.getEmail());
        assertNull(user.getLogin());
    }

    @Test
    void shouldCheckCorrectEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User("Nadya", "Drogolova"));
    }

    @Test
    void shouldCheckInequalityLoginEmail() {
        Assertions.assertThrows(InvalidParameterException.class, () -> new User("Nadya@.", "Nadya@."));
    }

}