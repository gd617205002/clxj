package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Carinfo")
@Component
public class CarinfoSocket extends SuperSocket {
    @Override
    public String me() {
        return null;
    }

    @Override
    public void init() {

    }
}