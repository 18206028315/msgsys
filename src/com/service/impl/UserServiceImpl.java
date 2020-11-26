package com.service.impl;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.eneity.User;
import com.service.UserService;

/**
 * 作者：凌宇
 * 日期：2020/11/26 18:47
 * 描述：
 */
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    public int register(User user) {
        return userDao.insert(user);
    }

    public User login(User user) {
        return userDao.queryUserByNameAndPassword(user);
    }
}
