package com.one.clxj.socket;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


import javax.websocket.server.ServerEndpoint;


/**
 * @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端,
 * 注解的值将被用于监听用户连接的终端访问URL地址,客户端可以通过这个URL来连接到WebSocket服务器端
 */
@ServerEndpoint("/socket/user")
@Component
@Slf4j
public class UserSocket extends SuperSocket{


}