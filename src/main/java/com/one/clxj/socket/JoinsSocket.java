package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Joins")
@Component
public class JoinsSocket extends SuperSocket {
    @Override
    public String me() {
        return JoinsSocket.class.getName();
    }
}