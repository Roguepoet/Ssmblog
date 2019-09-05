package com.fantasy.ssm.blog.mapper;

import com.fantasy.ssm.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserByNameOrEmail(String str);
}
