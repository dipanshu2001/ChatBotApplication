package com.project.ChatBotApplication.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
    public String getReply(String message) {
        if (message == null || message.trim().isEmpty()) {
            return "Invalid message";
        }
        message = message.trim().toLowerCase();
        switch (message) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            default:
                return "Sorry, I didn't understand";
        }
    }
}
