package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private String login;

    public User(String email, String login) {
        if (checkingUserParameters(email, login)) {
            this.email = email;
            this.login = login;
        }
    }

    public User() {
        this.email = null;
        this.login = null;
    }

    public boolean checkingUserParameters(String email, String login) {
        return !email.equals(login) && email.contains("@") && email.contains(".");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
