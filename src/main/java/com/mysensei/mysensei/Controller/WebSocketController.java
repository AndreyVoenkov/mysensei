package com.mysensei.mysensei.Controller;

import com.mysensei.mysensei.Service.OpenAiGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    private OpenAiGptService openAiGptService;

    @MessageMapping("/interview")
    @SendTo("/topic/responses")
    public String handleInterviewQuestion(String question) {
        return openAiGptService.generateResponse(question);
    }
}
