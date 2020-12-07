package com.zzz.wilson.lai.service.impl;

import com.zzz.wilson.lai.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/12/7 22:52
 * @ Description：消息提供者实现类
 * @ Modified By：
 * @ Version:
 */
@EnableBinding(Source.class)//定义消息的推送管道
@Slf4j
public class IMessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel output;//消息发送管道
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("发送MQ成功：" + serial);
        return serial;
    }
}
