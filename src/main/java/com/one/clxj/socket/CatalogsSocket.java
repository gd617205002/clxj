package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Catalogs")
@Component
public class CatalogsSocket extends SuperSocket {

    @Override
    public String me() {
        return CatalogsSocket.class.getName();
    }
}