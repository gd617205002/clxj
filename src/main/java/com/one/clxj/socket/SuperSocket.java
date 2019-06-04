package com.one.clxj.socket;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.one.clxj.pojo.Adminuser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.websocket.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端,
 * 注解的值将被用于监听用户连接的终端访问URL地址,客户端可以通过这个URL来连接到WebSocket服务器端
 */
public abstract class SuperSocket {
    //    type的常量
    public final static String ADD = "add";
    public final static String DEL = "del";
    public final static String CHAN = "chan";

    //    模板
    public final String template = "{'type':'{type}','sign','{sign}','data',{data}}";
    //    会话集合
    public static List<Session> list = new ArrayList<Session>();
    //    日志
    public static Logger log = LoggerFactory.getLogger(SuperSocket.class);
    ;

    /**
     * 生成消息
     */
    public String generateMassage(String type, String sign, String data) {
//      得到模板
        String massage = template;
//      生成消息
        massage = massage.replace("{type}", type);
        massage = massage.replace("{sign}", sign);
        massage = massage.replace("{data}", data);
        return massage;
    }

    /**
     * 生成data
     * 会忽略null的字段，如果为null的话就会被忽略
     *
     * @return
     */
    public String generateData(Object data) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            log.info("转换json失败");
            e.printStackTrace();
            return "null";
        }
        String reg = "(,\"[a-z|A-Z]*\":null)|(\"[a-z|A-Z]*\":null,)";
        json = json.replaceAll(reg, "");
//        System.out.println("返回json:"+json);

        return json;
    }


    /**
     * 生成消息并且发送
     */
    public void informAndSendMassage(String type, String sign, Object data) {
        String data1 = generateData(data);
        String massage = generateMassage(type, sign, data1);
        inform(massage);
    }

    /**
     * 连接建立成功调用的方法
     *
     * @param session 可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    @OnOpen
    public void onOpen(Session session) {
        this.list.add(session);
        log.info("【一个会话连接:" + session + "】");
        detailed();
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(Session session) {
        this.list.remove(session);
        log.info("【一个session关闭链接:" + session + "】");
        detailed();
    }

    /**
     * 给全体发送消息
     *
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
        log.info("【一个会话发生异常,自动将其移除:" + sessionToString + "】");
        log.info("异常信息如下" + err);
        detailed();
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
            log.info("【给一个会话发送消息失败，将其移除：" + session + "】");
            detailed();
            list.remove(session);
        }
    }

    /**
     * 给所有用户发送消息
     *
     * @param massage
     */
    private void sendMassageAll(String massage) {
        log.info("发送群体消息" + massage);
        if (list != null && list.size() > 0)
            for (int i = 0; i < list.size(); i++) {
                sendMassage(list.get(i), massage);
            }
    }

    public void detailed() {
        log.info(me() + "【当前房间有:" + list.size() + "人】");
    }


    public abstract String me();

    /**
     * 收到客户端消息后调用的方法
     * 不接收客户端消息不实现这个方法
     *
     * @param message 客户端发送过来的消息
     * @param session 可选的参数
     */
    @OnMessage
    public void onMessage(String message, Session session) {
    }


    public static void main(String[] args) {
        Adminuser adminuser = new Adminuser();
        adminuser.setName("你爸爸");
//        adminuser.setId(1);
        ObjectMapper mapper = new ObjectMapper();
        Object o = adminuser;
        String n = "(,\"[a-z|A-Z]*\":null)|(\"[a-z|A-Z]*\":null,)";
        try {
            String str = mapper.writeValueAsString(o);
            str = str.replaceAll(n, "");

            System.out.println(str);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}