package com.zzz.wilson.lai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/24 12:24
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPot;

    @RequestMapping("/payment/consul")
    public String getPaymentZk(){
        return "SpringCloud Consul版本，当前服务端口：" + serverPot + "  UUID：" +  UUID.randomUUID().toString();
    }
}
