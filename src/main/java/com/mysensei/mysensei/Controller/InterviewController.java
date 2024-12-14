package com.mysensei.mysensei.Controller;

import com.mysensei.mysensei.Service.OpenAiGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/interview")
public class InterviewController {

    @Autowired
    private OpenAiGptService openAiGptService;

    @PostMapping("/generate-response")
    public String generateResponse(@RequestBody String question) {
        String context = "You are an AI assistant helping a Java developer prepare for a job interview. Provide concise and professional answers to technical questions.";
        String fullPrompt = context + " Question: " + question;
        return openAiGptService.generateResponse(fullPrompt);
    }
}