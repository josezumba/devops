package com.example.retoDevops.controller;

import com.example.retoDevops.Service.DevOpsService;
import com.example.retoDevops.Service.dto.MessageDTO;
import com.example.retoDevops.models.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DevOpsRest {
    private final DevOpsService devOpsService;

    public DevOpsRest(DevOpsService devOpsService) {
        this.devOpsService = devOpsService;
    }

    @PostMapping
    public Message DevOps(@RequestBody MessageDTO messageInDTO) {
        return this.devOpsService.sendMessage(messageInDTO);
    }

}
