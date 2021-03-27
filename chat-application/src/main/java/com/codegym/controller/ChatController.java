package com.codegym.controller;

import com.codegym.config.AppConfig;
import com.codegym.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ChatController {

    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    private AppConfig appConfig;


    @PostMapping("/send-message")
    private String saveMessage(@RequestBody Message message) {

        template.convertAndSend("/topic/chat", message);

        return "Success";
    }

    @GetMapping("/join-room")
    private String joinRoom(@RequestParam String name) {

        template.convertAndSend("/topic/join-room", name);

        return "Join Room Success";
    }

    @GetMapping("test")
    private String text() {
        return appConfig.getUrl() + "abc";
    }


}
