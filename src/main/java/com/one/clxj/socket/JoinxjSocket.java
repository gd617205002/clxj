package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Joinxj")
@Component
public class JoinxjSocket extends SuperSocket {
    @Override
    public String me() {
        return JoinxjSocket.class.getName();
    }
}