package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Grouping")
@Component
public class GroupingSocket extends SuperSocket {
    @Override
    public String me() {
        return GroupingSocket.class.getName();
    }
}