package com.fantasy.ssm.blog.service.Impl;

import com.fantasy.ssm.blog.entity.User;
import com.fantasy.ssm.blog.mapper.UserMapper;
import com.fantasy.ssm.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Element_002
 * @title: UserServiceimpl
 * @projectName FantasySsm
 * @description: TODO
 * @date 2019/9/413:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User getUserByNameOrEmail(String str){
        return userMapper.getUserByNameOrEmail(str);
    }
}
