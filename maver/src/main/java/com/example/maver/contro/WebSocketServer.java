package com.example.maver.contro;

import org.springframework.stereotype.Component;

import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@Component
@ServerEndpoint("/chat")
public class WebSocketServer {
    private Session session;

}
