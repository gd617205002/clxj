package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/HelpinfoKey")
@Component
public class HelpinfoKeySocket extends SuperSocket {
    @Override
    public String me() {
        return HelpinfoKeySocket.class.getName();
    }
}