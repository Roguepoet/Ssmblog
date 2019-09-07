package com.fantasy.ssm.blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class AdminCrotroller {

    public String loginVerity(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<String,Object>();

        String usernamer =request.getParameter("username");
        String password = request.getParameter("password");
        String rememberme = request.getParameter("rememberme");

//        User user =UserService.get
        return null;


    }
}
