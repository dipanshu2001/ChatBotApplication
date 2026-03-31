package com.project.ChatBotApplication.model;

import lombok.Data;

@Data // for Getter and Setter methods
public class IncomingMessage {
    private String sender;
    private String message;

}
