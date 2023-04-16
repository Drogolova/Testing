package com.example.testing;

import java.security.InvalidParameterException;
import java.util.Objects;

public class User {

    private String login;
    private String email;


    public User(String login, String email) {
        if (login == null || email == null) {
            throw new NullPointerException();
        } if (!email.contains("@") || !email.contains(".")){
            throw new IllegalArgumentException();
        } if (login.equals(email)) {
            throw new InvalidParameterException();
        }
        else {
            this.login = login;
            this.email = email;
        }
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
