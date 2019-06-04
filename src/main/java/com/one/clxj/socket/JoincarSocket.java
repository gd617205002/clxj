package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Joincar")
@Component
public class JoincarSocket extends SuperSocket {
    @Override
    public String me() {
        return JoincarSocket.class.getName();
    }
}