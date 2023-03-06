package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private  String login;
    private final List<User> userList = new ArrayList<>();

    public User(String email, String login) {
        if (checkingUserParameters(email, login)) {
            this.email = email;
            this.login = login;
            userList.add(this);
        } else {
            throw new RuntimeException("Данные введены неправильно");
        }
    }

    public User() {

    }

    public boolean checkingUserParameters(String email, String login) {
        return email != login && email.contains("@") && email.contains(".");
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

    public List<User> getUserList() {
        return userList;
    }
}
