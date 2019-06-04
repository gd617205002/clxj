package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Reguser")
@Component
public class ReguserSocket extends SuperSocket {
    @Override
    public String me() {
        return ReguserSocket.class.getName();
    }
}