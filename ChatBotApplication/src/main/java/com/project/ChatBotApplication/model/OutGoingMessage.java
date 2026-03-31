package com.project.ChatBotApplication.model;

import lombok.Data;

@Data
public class OutGoingMessage {
    private String recipient;
    private String replyMessage;
}
