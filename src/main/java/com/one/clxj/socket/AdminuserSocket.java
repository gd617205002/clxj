package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Adminuser")
@Component
public class AdminuserSocket extends SuperSocket {

    @Override
    public String me() {
        return AdminuserSocket.class.getName();
    }

}