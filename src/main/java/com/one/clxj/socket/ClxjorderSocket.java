package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Clxjorder")
@Component
public class ClxjorderSocket extends SuperSocket {
    @Override
    public String me() {
        return ClxjorderSocket.class.getName();
    }
}