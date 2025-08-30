package com.whatsappclone;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    // Root path -> welcome.html
    @GetMapping("/")
    public String welcomePage() {
        return "welcome";
    }

    // Chat page -> chat.html
    @GetMapping("/chat")
    public String chatPage() {
        return "chat";
    }

    // WebSocket endpoint
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public Message sendMessage(Message message) {
        chatService.saveMessage(message); // Save to DB
        return message; // Broadcast to all users
    }

    // REST API to fetch all messages
    @GetMapping("/api/messages")
    @ResponseBody
    public List<Message> getAllMessages() {
        return chatService.getMessages();
    }

    // REST API to fetch messages for specific receiver
    @GetMapping("/api/messages/{receiver}")
    @ResponseBody
    public List<Message> getMessagesForReceiver(@PathVariable String receiver) {
        return chatService.getMessagesForReceiver(receiver);
    }
}
