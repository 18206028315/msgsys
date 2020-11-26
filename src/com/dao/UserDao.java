package com.dao;

import com.eneity.User;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/11/26 18:17
 * 描述：
 */
public interface UserDao {

    //增
    int insert(User user);

    //改
    int update(User user);

    //删
    int delete(Integer id);

    //查询全部
    List<User> queryAll();

    //通过ID查询
    User queryUserById(Integer id);

    //登录查询
    User queryUserByNameAndPassword(User user);
}
