package com.service;

import com.eneity.Message;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/11/26 21:27
 * 描述：
 */
public interface MessageService {
    //根据收信人的ID查询邮件
    List<Message> queryMessageByToUid(Integer id);

    //根据ID查询邮件的详情
    Message queryMessageById(Integer id);

}
