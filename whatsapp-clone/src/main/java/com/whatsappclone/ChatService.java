package com.whatsappclone;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatService {

    private final MessageRepository messageRepository;

    public ChatService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void saveMessage(Message message) {
        message.setTimestamp(LocalDateTime.now()); // set current timestamp
        messageRepository.save(message);          // save to DB
        System.out.println("✅ Saved message: " + message.getContent());
    }

    public List<Message> getMessages() {
        return messageRepository.findAll();
    }

    public List<Message> getMessagesForReceiver(String receiver) {
        return messageRepository.findByReceiver(receiver);
    }
}
