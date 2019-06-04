package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/ClxjmainWithBLOBs")
@Component
public class ClxjmainWithBLOBsSocket extends SuperSocket {
    @Override
    public String me() {
        return ClxjmainWithBLOBsSocket.class.getName();
    }
}