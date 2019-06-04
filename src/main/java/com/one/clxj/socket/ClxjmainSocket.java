package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Clxjmain")
@Component
public class ClxjmainSocket extends SuperSocket {
    @Override
    public String me() {
        return ClxjmainSocket.class.getName();
    }
}