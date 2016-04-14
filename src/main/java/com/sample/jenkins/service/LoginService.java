package com.sample.jenkins.service;

/**
 * Created by rgidwani on 09-04-2016.
 */
public interface LoginService {
    public boolean authenticateUser(String username, String password) throws Exception;
    public void signUp(String username, String password) throws Exception;
}
