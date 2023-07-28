package com.pth.springbootlibrary.service;

import com.pth.springbootlibrary.dao.MessageRepository;
import com.pth.springbootlibrary.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MessagesService {

    private MessageRepository messageRepository;

    @Autowired
    public MessagesService(MessageRepository messageRepository){
        this.messageRepository =messageRepository;
    }

    public void postMessage(Message messageRequest, String userEmail){
        Message message = new Message(messageRequest.getTitle(), messageRequest.getQuestion());
        message.setUserEmail(userEmail);
        messageRepository.save(message);
    }
}
