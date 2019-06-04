package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Donation")
@Component
public class DonationSocket extends SuperSocket {
    @Override
    public String me() {
        return DonationSocket.class.getName();
    }
}