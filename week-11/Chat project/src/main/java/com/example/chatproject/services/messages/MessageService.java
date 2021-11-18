package com.example.chatproject.services.messages;

import com.example.chatproject.models.Message;

import java.util.List;

public interface MessageService {

    List<Message> getRecentMessages();
}
