package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Clxjcomment")
@Component
public class ClxjcommentSocket extends SuperSocket {
    @Override
    public String me() {
        return ClxjcommentSocket.class.getName();
    }
}