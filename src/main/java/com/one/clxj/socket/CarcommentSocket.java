package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Carcomment")
@Component
public class CarcommentSocket extends SuperSocket {

    @Override
    public String me() {
        return CarcommentSocket.class.getName();
    }
}