package com.dao.impl;

import com.dao.BaseDao;
import com.dao.UserDao;
import com.eneity.User;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/11/26 18:17
 * 描述：
 */
public class UserDaoImpl extends BaseDao implements UserDao {

    public int insert(User user) {
        String sql="INSERT INTO `user` (`username`,`password`,`email`) VALUES (?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    public int update(User user) {
        String sql="UPDATE `user` SET `username`= ? , `password`= ? , `email`= ? WHERE `id` = ?";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail(),user.getId());
    }

    public int delete(Integer id) {
        String sql = "DELETE FROM `user` WHERE `id` = ?";
        return update(sql,id);
    }

    public List<User> queryAll() {
        String sql = "SELECT * FROM `user`";
        return queryForList(User.class,sql);
    }

    public User queryUserById(Integer id) {
        String sql = "SELECT * FROM `user` WHERE `id` = ?";
        return queryForOne(User.class,sql,id);
    }

    public User queryUserByNameAndPassword(User user) {
        String sql = "SELECT * FROM `user` WHERE `username`= ? AND `password`= ?";
        return queryForOne(User.class, sql, user.getUsername(), user.getPassword());
    }
}
