package com.sample.jenkins.beans;

/**
 * Created by rgidwani on 10-04-2016.
 */
public class LoginDetail {
    private int id;
    private String username;
    private String password;

    public LoginDetail(String username, String password){
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
