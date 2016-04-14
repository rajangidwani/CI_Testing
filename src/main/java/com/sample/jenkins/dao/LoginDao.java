package com.sample.jenkins.dao;

/**
 * Created by rgidwani on 09-04-2016.
 */
public interface LoginDao {
    public boolean authenticateUser(String username, String password) throws Exception;
    public void signUp(String usename, String password);
}