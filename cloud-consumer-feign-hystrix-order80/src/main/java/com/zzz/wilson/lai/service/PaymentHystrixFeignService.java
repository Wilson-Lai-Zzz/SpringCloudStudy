package com.zzz.wilson.lai.service;

import com.zzz.wilson.lai.service.FeignFallbackServerImpl.PaymentHystrixFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/1 19:22
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentHystrixFeignServiceImpl.class)
public interface PaymentHystrixFeignService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id);

    @GetMapping("payment/hystrix/timeOut/{id}")
    public String paymentInfo_timeOut(@PathVariable("id") Integer id);
}
