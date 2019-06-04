package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Joincl")
@Component
public class JoinclSocket extends SuperSocket {

    @Override
    public String me() {
        return JoinclSocket.class.getName();
    }
}