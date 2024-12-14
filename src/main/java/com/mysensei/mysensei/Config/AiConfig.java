package com.mysensei.mysensei.Config;

import com.mysensei.mysensei.Service.OpenAiApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

    @Value("${openai.api.key}")
    private String openaiApiKey;

    @Bean
    public OpenAiApiService openAiApiService() {
        return new OpenAiApiService(openaiApiKey);
    }
}