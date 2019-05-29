package com.one.clxj.socket;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.websocket.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
/**
 * @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端,
 * 注解的值将被用于监听用户连接的终端访问URL地址,客户端可以通过这个URL来连接到WebSocket服务器端
 */
public abstract class SuperSocket {


    public static File logFile = null;

    public static List<Session> list = new ArrayList<Session>();


    //日志打印
    private static final Logger log = LoggerFactory.getLogger(SuperSocket.class);

    /**
     * 连接建立成功调用的方法
     *
     * @param session 可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    @OnOpen
    public void onOpen(Session session) {
        this.list.add(session);
        log.info("一个session链接，----->"+session);
        log.info("当前房间"+list.size()+"人");
//        sendMassage(session,"连接成功");
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(Session session) {
        this.list.remove(session);
        log.info("一个session关闭链接，----->"+session);
        log.info("当前房间"+list.size()+"人");
    }

    /**
     *  收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     * @param session 可选的参数
     */
    @OnMessage
    public void onMessage(String message, Session session) {

    }

    /**
     * @param massage
     * @return
     */
    public void inform(String massage) {
        sendMassageAll(massage);
    }

    /**
     * 发生错误时调用
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        String err = error.getMessage();
        String sessionToString = session.toString();
        log.info("一个session发生异常,自动将其移除-->", sessionToString);
        log.info("当前房间"+list.size()+"人");

        log.info("异常信息如下" + err);

    }


    /**
     * 给单一用户发送消息
     *
     * @param session
     * @param massage
     * @return
     */
    private void sendMassage(Session session, String massage) {
        try {
            session.getBasicRemote().sendText(massage);
        } catch (IOException e) {
            log.info("给一个session发送消息失败，将其移除--->" + session);
            log.info("当前房间"+list.size()+"人");
            list.remove(session);
        }
    }

    /**
     * 给所有用户发送消息
     * @param massage
     */
    private void sendMassageAll(String massage) {
        log.info("发送群体消息"+massage+":::"+list.size());
        for (int i = 0; i < list.size(); i++) {
            log.info("发送消息"+massage);
            sendMassage(list.get(i), massage);
        }
    }
//  表示当前是哪个对象
    public abstract String me();
//
    public abstract void init();

}