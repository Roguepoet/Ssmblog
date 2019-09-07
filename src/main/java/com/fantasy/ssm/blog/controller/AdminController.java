package com.fantasy.ssm.blog.controller;

import com.fantasy.ssm.blog.entity.User;
import com.fantasy.ssm.blog.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RequestMapping(value = "/admin")
public class AdminController {


    @Autowired
    private UserService userService;

//    登录页面
    @RequestMapping(value = "login")
    public String loginPage(){
        return "/admin/login";
    }

    @RequestMapping(value = "/loginVerity",method = RequestMethod.POST)
    public String loginVerity(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<String,Object>();

        String username =request.getParameter("username");
        String password = request.getParameter("password");
//        String rememberme = request.getParameter("rememberme");

        User user = userService.getUserByNameOrEmail(username);
        if(user==null){
            map.put("code",0);
            map.put("msg","账户不存在");
        }else if(!user.getUserPass().equals(password)){
            map.put("code",0);
            map.put("msg","账户或密码错误");
        }else{
            map.put("code",200);
            map.put("msg","");
        }
        String result = new JSONObject(map).toString();
        return result;


    }
}
