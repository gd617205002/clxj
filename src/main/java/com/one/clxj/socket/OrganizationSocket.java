package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Organization")
@Component
public class OrganizationSocket extends SuperSocket {
    @Override
    public String me() {
        return null;
    }

    @Override
    public void init() {

    }
}