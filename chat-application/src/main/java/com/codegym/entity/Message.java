package com.codegym.entity;

public class Message {
    private Integer id;
    private String content;
    private String nameSendMessage;

    public Message() {
    }

    public Message(Integer id, String content, String nameSendMessage) {
        this.id = id;
        this.content = content;
        this.nameSendMessage = nameSendMessage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNameSendMessage() {
        return nameSendMessage;
    }

    public void setNameSendMessage(String nameSendMessage) {
        this.nameSendMessage = nameSendMessage;
    }
}
