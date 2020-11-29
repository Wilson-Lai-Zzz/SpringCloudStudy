package com.zzz.wilson.lai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/19 23:22
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPot;

    @RequestMapping("/payment/zk")
    public String getPaymentZk(){
        return "SpringCloud Zookeeper版本，当前服务端口：" + serverPot + "UUID：" +  UUID.randomUUID().toString();
    }
}
