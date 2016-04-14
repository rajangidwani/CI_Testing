package com.sample.jenkins.service.impl;

import com.sample.jenkins.dao.LoginDao;
import com.sample.jenkins.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rgidwani on 09-04-2016.
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginDao loginDao;

    @Override
    public boolean authenticateUser(String username, String password) throws Exception{
        try{
            return loginDao.authenticateUser(username,password);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void signUp(String username, String password) throws Exception {
        try{
            loginDao.signUp(username,password);
        }catch (Exception e){
            throw e;
        }
    }


}
