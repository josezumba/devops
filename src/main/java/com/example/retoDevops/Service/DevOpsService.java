package com.example.retoDevops.Service;

import com.example.retoDevops.Service.dto.MessageDTO;
import com.example.retoDevops.mapper.MessageDTOtoMessage;
import com.example.retoDevops.models.Message;
import org.springframework.stereotype.Service;

@Service
public class DevOpsService {
private final MessageDTOtoMessage mapper;

    public DevOpsService(MessageDTOtoMessage mapper) {
        this.mapper = mapper;
    }

    public Message sendMessage(MessageDTO messageInDTO){
        Message message = mapper.map(messageInDTO);
        return message;
    }
}
