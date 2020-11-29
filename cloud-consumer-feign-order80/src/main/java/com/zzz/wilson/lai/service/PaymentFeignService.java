package com.zzz.wilson.lai.service;

import com.zzz.wilson.lai.entities.CommentResult;
import com.zzz.wilson.lai.entities.PayMent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/25 17:37
 * @ Description：OpenFeign接口调用
 * @ Modified By：
 * @ Version:
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")//声明服务的提供方，provider的服务名称
public interface PaymentFeignService {
    @GetMapping(value = "/payMent/getPayMentById/{id}")//服务通过方的接口服务地址
    public CommentResult<PayMent> getPayMentById(@PathVariable("id") Long id);
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
