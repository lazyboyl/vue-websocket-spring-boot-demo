package com.websocket.demo.controller;

import com.websocket.demo.config.PushMessage;
import com.websocket.demo.config.SocketIoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2019-06-13
 * 类描述：测试接口调用类
 */
@RestController
@RequestMapping("/socket")
public class SocketController {

    @Autowired
    private SocketIoService socketIoService;

    @GetMapping("/send")
    public String sendMsg(@RequestParam("content")String content,@RequestParam("loginUser")String loginUser){
        socketIoService.pushMessageToUser(new PushMessage(loginUser,"",content));
        return "OK";
    }

}
