package com.example.chatproject.services.messages;

import com.example.chatproject.models.Message;
import com.example.chatproject.repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> getRecentMessages() {
        if (messageRepository.findAll().size() >= 10)
            return messageRepository.findAll().subList(0, 9);
        else return messageRepository.findAll().subList(0, messageRepository.findAll().size());
    }
}
