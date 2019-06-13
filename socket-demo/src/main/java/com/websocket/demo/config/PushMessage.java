package com.websocket.demo.config;

/**
 * @author linzf
 * @since 2019-06-13
 * 类描述：socket消息发送实体类
 */
public class PushMessage {

    /**
     * 当前登陆的用户
     */
    private String loginUser;

    /**
     * 推送的标题
     */
    private String title;

    /**
     * 推送的内容
     */
    private String content;

    /**
     * 空的构造函数
     */
    public PushMessage() {
        super();
    }

    /**
     * 构造函数
     * @param loginUser
     * @param title
     * @param content
     */
    public PushMessage(String loginUser,String title, String content) {
        this.loginUser = loginUser;
        this.title = title;
        this.content = content;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
