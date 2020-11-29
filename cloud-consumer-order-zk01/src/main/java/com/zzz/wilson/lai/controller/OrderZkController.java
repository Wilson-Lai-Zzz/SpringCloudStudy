package com.zzz.wilson.lai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/21 23:05
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
public class OrderZkController {
    private String providerServerName = "http://cloud-provider-payment-zk";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        return restTemplate.getForObject(providerServerName + "/payment/zk", String.class);
    }
}
