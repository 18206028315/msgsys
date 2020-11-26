package com.service;

import com.eneity.User;

/**
 * 作者：凌宇
 * 日期：2020/11/26 18:39
 * 描述：
 */
public interface UserService {

    //注册
    int register(User user);

    //登录
    User login(User user);
}
