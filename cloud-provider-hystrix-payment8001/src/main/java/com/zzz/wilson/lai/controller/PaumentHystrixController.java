package com.zzz.wilson.lai.controller;

import com.zzz.wilson.lai.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/28 23:57
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
public class PaumentHystrixController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_ok(id);
        log.info("********result：" + result);
        return result;
    }

    @GetMapping("/payment/hystrix/timeOut/{id}")
    public String paymentInfo_timeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_timeOut(id);
        log.info("********result：" + result);
        return result;
    }

    @GetMapping("/payment/hystrix/circutBreaker/{id}")
    public String paymentCircutBreaker(@PathVariable("id") Integer id){
        String result = paymentService.paymentCircutBreaker(id);
        log.info("********paymentCircutBreaker：" + result);
        return result;
    }
}
