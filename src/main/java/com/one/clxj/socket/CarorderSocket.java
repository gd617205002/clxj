package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Carorder")
@Component
public class CarorderSocket extends SuperSocket {
    @Override
    public String me() {
        return null;
    }

    @Override
    public void init() {

    }
}