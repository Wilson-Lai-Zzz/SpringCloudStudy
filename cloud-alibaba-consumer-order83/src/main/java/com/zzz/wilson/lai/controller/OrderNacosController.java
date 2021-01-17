package com.zzz.wilson.lai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2021/1/17 15:01
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
public class OrderNacosController {
    @Value("${service-url.nacos-user-service}")
    private String serverUrl;
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("getPayment/{stringId}")
    public String getPayment(@PathVariable("stringId") String stringId){
        log.info("有来客，见面礼是：" + stringId + "，去调用服务提供者");
        return restTemplate.getForObject(serverUrl + "/getProviderPayment/" + stringId, String.class);
    }
}
