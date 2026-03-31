package com.project.ChatBotApplication.controller;

import com.project.ChatBotApplication.model.IncomingMessage;
import com.project.ChatBotApplication.model.OutGoingMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.project.ChatBotApplication.service.ChatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebhookController.class);
    private final ChatService chatService;
    // constructor injection
    public WebhookController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/webhook")
    public OutGoingMessage receiveMessage(@RequestBody IncomingMessage request) {
        LOGGER.info("Incoming message from {}: {}",request.getSender(),request.getMessage());

        String reply= chatService.getReply(request.getMessage());

        OutGoingMessage response = new OutGoingMessage();
        response.setRecipient(request.getSender());
        response.setReplyMessage(reply);

        LOGGER.info("Reply sent to {}: {}",response.getRecipient(),response.getReplyMessage());
        return response;
    }
}
