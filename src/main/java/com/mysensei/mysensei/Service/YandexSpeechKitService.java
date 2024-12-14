package com.mysensei.mysensei.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class YandexSpeechKitService {

    @Value("${yandex.speechkit.api.key}")
    private String apiKey;

    private static final String YANDEX_SPEECH_URL = "https://stt.api.cloud.yandex.net/speech/v1/stt:recognize?lang=ru-RU";

    public String transcribeAudio(byte[] audioData) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Api-Key " + apiKey);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

            HttpEntity<byte[]> request = new HttpEntity<>(audioData, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(YANDEX_SPEECH_URL, request, String.class);

            return response.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}