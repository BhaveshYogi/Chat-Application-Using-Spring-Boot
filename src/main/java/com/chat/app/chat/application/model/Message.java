package com.chat.app.chat.application.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    private String senderName;
    private String receiverName;
    private String message;

    private String date;

    private Status status;
}
