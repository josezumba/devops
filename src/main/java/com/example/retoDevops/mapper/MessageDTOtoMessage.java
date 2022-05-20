package com.example.retoDevops.mapper;

import com.example.retoDevops.models.Message;
import com.example.retoDevops.Service.dto.MessageDTO;
import org.springframework.stereotype.Component;

@Component
public class MessageDTOtoMessage implements IMapper<MessageDTO, Message> {
    @Override
    public Message map(MessageDTO in) {
        Message message = new Message();
        message.setMessage("Hello ".concat(in.getTo()).concat(" your message will be send"));
        return message;
    }
}
