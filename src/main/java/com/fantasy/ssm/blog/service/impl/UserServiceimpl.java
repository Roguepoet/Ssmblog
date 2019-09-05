package com.fantasy.ssm.blog.service.Impl;

import com.fantasy.ssm.blog.entity.User;
import com.fantasy.ssm.blog.mapper.UserMapper;
import com.fantasy.ssm.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Element_002
 * @title: UserServiceimpl
 * @projectName FantasySsm
 * @description: TODO
 * @date 2019/9/413:52
 */
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired
    public User getUserByNameOrEmail(String str){
        return UserMapper.getUserByNameOrEmail(str);
    }


}
