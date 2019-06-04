package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Helpinfo")
@Component
public class HelpinfoSocket extends SuperSocket {

    @Override
    public String me() {
        return HelpinfoSocket.class.getName();
    }
}