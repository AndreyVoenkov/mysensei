//package com.mysensei.mysensei.Service;
//
//import reactor.core.publisher.Flux;
//
//public class OpenAiApiStub {
//    private final String apiKey;
//
//    public OpenAiApiStub(String apiKey) {
//        this.apiKey = apiKey;
//    }
//
//    public String call(String prompt) {
//        // Здесь должен быть реальный вызов OpenAI API
//        return "Response from OpenAI API";
//    }
//
//    public Flux<String> stream(String prompt) {
//        // Здесь должен быть реальный потоковый вызов OpenAI API
//        return Flux.just("Chunk 1", "Chunk 2", "Chunk 3");
//    }
//}