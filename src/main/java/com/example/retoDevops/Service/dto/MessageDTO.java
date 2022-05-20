package com.example.retoDevops.Service.dto;

import lombok.Data;

@Data
public class MessageDTO {
    private String message;
    private String to;
    private String from;
    private Long timeToLifeSec;
}
