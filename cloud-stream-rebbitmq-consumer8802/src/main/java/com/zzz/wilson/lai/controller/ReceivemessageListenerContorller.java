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
 * @ Date       ：创建于 2020/12/20 22:46
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Slf4j
@Component
@EnableBinding(Sink.class)//定义消息的接受管道————消费者
public class ReceivemessageListenerContorller {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        log.info("消费者1号，------>接收到消息：" + message.getPayload() + "\t port：" + serverPort);
    }
}
