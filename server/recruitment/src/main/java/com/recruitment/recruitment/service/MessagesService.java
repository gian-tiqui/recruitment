package com.recruitment.recruitment.service;

import com.recruitment.recruitment.entity.Messages;

import java.util.List;

public interface MessagesService {

    Messages getMessagesById();
    List<Messages> getMessages();
    List<Messages> getMessagesSentBy();
    List<Messages> getMessagesReceivedBy();
}
