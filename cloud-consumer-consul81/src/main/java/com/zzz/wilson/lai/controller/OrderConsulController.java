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
public class OrderConsulController {
    private String providerServerName = "http://consul-provider-payment-consul";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        return restTemplate.getForObject(providerServerName + "/payment/consul", String.class);
    }
}
