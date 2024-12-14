package com.mysensei.mysensei.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenAiGptService {

    @Autowired
    private OpenAiApiService openAiApiService;

    public String generateResponse(String question) {
        return openAiApiService.call(question);
    }
}