package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;


import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Grant")
@Component
public class GrantSocket extends SuperSocket {
    @Override
    public String me() {
        return GrantSocket.class.getName();
    }
}