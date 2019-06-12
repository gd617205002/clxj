package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;


import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Grants")
@Component
public class GrantsSocket extends SuperSocket {
    @Override
    public String me() {
        return GrantsSocket.class.getName();
    }
}