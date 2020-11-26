package com.dao;

import com.eneity.Message;


import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/11/26 18:17
 * 描述：
 */
public interface MessageDao {

    //增
    int insert(Message message);

    //改
    int update(Message message);

    //删
    int delete(Integer id);

    //查询全部
    List<Message> queryAll();

    //通过ID查询
    Message queryMessageById(Integer id);

    //根据收信人的ID查询邮件
    List<Message> queryMessageByToUid(Integer id);
}
