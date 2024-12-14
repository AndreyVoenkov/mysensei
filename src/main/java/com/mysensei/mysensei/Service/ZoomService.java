//package com.mysensei.mysensei.Service;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class ZoomService {
//
//    @Value("${zoom.api.key}")
//    private String apiKey;
//
//    @Value("${zoom.api.secret}")
//    private String apiSecret;
//
//    private final RestTemplate restTemplate = new RestTemplate();
//
//    public String createMeeting(String topic, String startTime) {
//        String url = "https://api.zoom.us/v2/users/me/meetings";
//
//        // Создание тела запроса
//        String requestBody = "{\"topic\": \"" + topic + "\", \"start_time\": \"" + startTime + "\"}";
//
//        // Отправка запроса
//        String response = restTemplate.postForObject(url, requestBody, String.class);
//        return response;
//    }
//}
