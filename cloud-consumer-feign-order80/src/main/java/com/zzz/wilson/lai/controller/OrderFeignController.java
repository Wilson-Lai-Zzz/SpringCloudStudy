package com.zzz.wilson.lai.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zzz.wilson.lai.entities.CommentResult;
import com.zzz.wilson.lai.entities.PayMent;
import com.zzz.wilson.lai.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/25 17:45
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/feign/payment/get/{id}")
    public CommentResult<PayMent> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPayMentById(id);
    }

    public String getPaymentTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}
