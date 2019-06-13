package com.websocket.demo.config;

/**
 * @author linzf
 * @since 2019-06-13
 * 类描述：socket的接口类
 */
public interface SocketIoService {

    /**
     * 推送的事件
     */
    String PUSH_EVENT = "push_event";

    /**
     * 启动服务
     *
     * @throws Exception
     */
    void start() throws Exception;

    /**
     * 停止服务
     */
    void stop();

    /**
     * 推送信息
     *
     * @param pushMessage
     */
    void pushMessageToUser(PushMessage pushMessage);

}
