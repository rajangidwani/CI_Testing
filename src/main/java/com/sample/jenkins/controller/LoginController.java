package com.sample.jenkins.controller;

import com.sample.jenkins.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rgidwani on 09-04-2016.
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String authenticateUser(@RequestHeader("username") String username, @RequestHeader("password") String password) throws Exception{
        try {
            boolean result = loginService.authenticateUser(username,password);
            if(result){
                return "Loged in successfully";
            }
            else
                return "Sorry, failed";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Exception caught";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String signUp(@RequestHeader("username") String username, @RequestHeader("password") String password) throws Exception{
        try {
            loginService.signUp(username,password);
        }catch (Exception e){
            e.printStackTrace();
            return "Failed to sign up";
        }
        return "Account created !!!!";
    }

}
