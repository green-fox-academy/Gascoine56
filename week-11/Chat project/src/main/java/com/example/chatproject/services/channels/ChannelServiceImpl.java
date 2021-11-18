package com.example.chatproject.services.channels;

import com.example.chatproject.repositories.ChannelRepository;

public class ChannelServiceImpl implements ChannelService{

    ChannelRepository channelRepository;

    public ChannelServiceImpl(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }

}
