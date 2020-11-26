package com.dao.impl;

import com.dao.BaseDao;
import com.dao.MessageDao;
import com.eneity.Message;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/11/26 20:45
 * 描述：
 */
public class MessageDaoImpl extends BaseDao implements MessageDao {
    public int insert(Message message) {
        String sql = "INSERT INTO `message` (`fromUid`, `toUid`, `mTitle`, `mContent`, `isReadFlag`, `createTime`) VALUES (?,?,?,?,?,?)";
        return update(sql, message.getFromUid(), message.getToUid(), message.getmTitle(), message.getmContent(), message.getIsReadFlag(), message.getCreateTime());
    }

    public int update(Message message) {
        String sql = "UPDATE `message` SET `fromUid` = ?, `toUid` = ?, `mTitle` = ?, `mContent` = ?, `isReadFlag` = ?, `createTime` = ?  WHERE `id` = ?";
        return update(sql, message.getFromUid(), message.getToUid(), message.getmTitle(), message.getmContent(), message.getIsReadFlag(), message.getCreateTime(),message.getId());
    }

    public int delete(Integer id) {
        String sql = "DELETE FROM `message` WHERE `id` = ?";
        return update(sql,id);
    }

    public List<Message> queryAll() {
        String sql = "SELECT * FROM `message`";
        return queryForList(Message.class,sql);
    }

    public Message queryMessageById(Integer id) {
        String sql = "SELECT * FROM `message` WHERE `id` = ?";
        return queryForOne(Message.class,sql,id);
    }

    public List<Message> queryMessageByToUid(Integer id) {
        String sql = "SELECT * FROM `message` WHERE `toUid` = ?";
        return queryForList(Message.class,sql,id);
    }
}
