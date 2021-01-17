package com.zzz.wilson.lai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/12/21 23:16
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@EnableBinding(Sink.class)//绑定输入通道
@Component
@Slf4j
public class ReceivemessageListenerContorller {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        log.info("消费者1号，------>接收到消息：" + message.getPayload() + "\t port：" + serverPort);
    }
}
