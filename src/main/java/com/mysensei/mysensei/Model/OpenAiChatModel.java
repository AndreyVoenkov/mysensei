//package com.mysensei.mysensei.Model;
//
//import com.mysensei.mysensei.Service.OpenAiApiService;
//import reactor.core.publisher.Flux;
//
//public class OpenAiChatModel {
//
//    private final OpenAiApiService openAiApi;
//
//    public OpenAiChatModel(String apiKey) {
//        this.openAiApi = new OpenAiApiService(apiKey);
//    }
//
//    public String generateResponse(String prompt) {
//        return openAiApi.call(prompt);
//    }
//
//    public Flux<String> streamResponse(String prompt) {
//        return openAiApi.stream(prompt);
//    }
//}
