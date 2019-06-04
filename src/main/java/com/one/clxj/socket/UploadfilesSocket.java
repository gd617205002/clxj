package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/Uploadfiles")
@Component
public class UploadfilesSocket extends SuperSocket {
    @Override
    public String me() {
        return UploadfilesSocket.class.getName();
    }
}