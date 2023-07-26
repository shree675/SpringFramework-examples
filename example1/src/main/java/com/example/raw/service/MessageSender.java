package com.example.raw.service;

import org.springframework.stereotype.Component;

public interface MessageSender {
    public void sendMessage();
}

/*
 * there are two potential components
 * 
 * in MesssageService class, we do not
 * need to mention `new EmailMessageSender()`
 * or `new SMSMessageSender()`
 * 
 * by not mentioning the above, we can switch
 * between different message sender classes
 * without having to rewrite
 * `new EmailMessageSender()` and `new SMSMessageSender()`
 * in MessageService
 * 
 * this is the advantage of beans and @Autowired
 */

// @Component
// class EmailMessageSender implements MessageSender {
// public void sendMessage() {
// System.out.println("email message sent");
// }
// }

@Component
class SMSMessageSender implements MessageSender {
    public void sendMessage() {
        System.out.println("sms message sent");
    }
}