package com.fantasy.ssm.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -4766263243604696150L;
//用户id
    private Integer userId;
//用户名
    private String userName;
//用户密码
    private String userPass;
//用户昵称
    private String userNickname;
//邮箱
    private String userEmail;

    private String userUrl;

    private String userAvatar;
//用户最后一次登录时IP
    private String userLastLoginIp;
//用户注册时间
    private Date userRegisterTime;
//用户最后登录时间
    private Date userLastLoginTime;
//用户状态
    private Integer userStatus;


    private Integer articleCount;

}


