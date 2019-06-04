package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import com.one.clxj.pojo.Helpcomment;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Helpcomment")
@Component
public class HelpcommentSocket extends SuperSocket {
    @Override
    public String me() {
        return HelpcommentSocket.class.getName();
    }
}