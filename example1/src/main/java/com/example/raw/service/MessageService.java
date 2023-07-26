package com.example.raw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * same as @Component
 */
@Service
public class MessageService {

    @Autowired
    private MessageSender messageSender;

    /*
     * the below commented code also works
     * then, remove @Autowired from line 9
     */

    // @Autowired
    // public MessageService(MessageSender messageSender) {
    // this.messageSender = messageSender;
    // }

    public void sendMessage() {
        messageSender.sendMessage();
    }
}