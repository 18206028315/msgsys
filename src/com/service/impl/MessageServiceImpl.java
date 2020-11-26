package com.service.impl;

import com.dao.MessageDao;
import com.dao.impl.MessageDaoImpl;
import com.eneity.Message;
import com.service.MessageService;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/11/26 21:35
 * 描述：
 */
public class MessageServiceImpl implements MessageService {
    MessageDao messageDao = new MessageDaoImpl();
    @Override
    public List<Message> queryMessageByToUid(Integer id) {
        return messageDao.queryMessageByToUid(id);
    }

    @Override
    public Message queryMessageById(Integer id) {
        return messageDao.queryMessageById(id);
    }
}
