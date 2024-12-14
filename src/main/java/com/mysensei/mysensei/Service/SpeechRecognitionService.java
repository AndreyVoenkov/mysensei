//package com.mysensei.mysensei.Service;
//
//import com.google.cloud.speech.v1.*;
//import com.google.protobuf.ByteString;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.logging.Logger;
//
//public class SpeechRecognitionService {
//    private static final Logger logger = Logger.getLogger(SpeechRecognitionService.class.getName());
//
//    public String recognizeSpeech(Path audioFilePath) {
//        try (SpeechClient speechClient = SpeechClient.create()) {
//            RecognitionConfig config = RecognitionConfig.newBuilder()
//                    .setEncoding(RecognitionConfig.AudioEncoding.LINEAR16)
//                    .setSampleRateHertz(16000)
//                    .setLanguageCode("en-US")
//                    .build();
//
//            byte[] audioBytes = Files.readAllBytes(audioFilePath);
//            RecognitionAudio audio = RecognitionAudio.newBuilder()
//                    .setContent(ByteString.copyFrom(audioBytes))
//                    .build();
//
//            RecognizeResponse response = speechClient.recognize(config, audio);
//            for (SpeechRecognitionResult result : response.getResultsList()) {
//                return result.getAlternativesList().get(0).getTranscript();
//            }
//        } catch (IOException e) {
//            logger.severe("Error reading audio file: " + e.getMessage());
//        } catch (Exception e) {
//            logger.severe("Error during speech recognition: " + e.getMessage());
//        }
//        return "";
//    }
//}