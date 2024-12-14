package com.mysensei.mysensei.Controller;

import com.mysensei.mysensei.Service.OpenAiGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class WebRtcSignalingController extends TextWebSocketHandler {

    @Autowired
    private OpenAiGptService openAiGptService;

    private final List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessions.add(session);
        broadcastMessage("New user connected", session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String response = openAiGptService.generateResponse(message.getPayload());
        session.sendMessage(new TextMessage(response));
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessions.remove(session);
        broadcastMessage("User disconnected", session);
    }

    private void broadcastMessage(String message, WebSocketSession sender) throws IOException {
        for (WebSocketSession session : sessions) {
            if (session.isOpen() && !session.equals(sender)) {
                session.sendMessage(new TextMessage(message));
            }
        }
    }
}