package com.fantasy.ssm.blog.service;


import com.fantasy.ssm.blog.entity.User;
import java.util.List;

public interface UserService {

//    获取用户列表
    List<User> listUser();

    User getUserByNameOrEmail(String str);

}
