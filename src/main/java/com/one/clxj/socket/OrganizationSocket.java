package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Organization")
@Component
public class OrganizationSocket extends SuperSocket {
    @Override
    public String me() {
        return OrganizationSocket.class.getName();
    }
}