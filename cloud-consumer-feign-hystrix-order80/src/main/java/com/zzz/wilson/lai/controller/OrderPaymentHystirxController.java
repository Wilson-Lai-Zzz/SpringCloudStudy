package com.zzz.wilson.lai.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zzz.wilson.lai.service.PaymentHystrixFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/1 19:25
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "paymentConsumerDefaultFallback")
public class OrderPaymentHystirxController {

    @Autowired
    private PaymentHystrixFeignService paymentHystrixFeignService;
    @GetMapping("/payment/hystrix/ok/{id}")
    @HystrixCommand()
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        log.info("feign-hystrix-order80服务进来拉，准备调用服务提供方OK的方法");
        return paymentHystrixFeignService.paymentInfo_ok(id);
    }

//    @HystrixCommand(fallbackMethod = "paymentInfo_timeOutFallback", //兜底处理方法
//            commandProperties = {//command的配置
//                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//            })
    @GetMapping("payment/hystrix/timeOut/{id}")
    public String paymentInfo_timeOut(@PathVariable("id") Integer id){
        log.info("feign-hystrix-order80服务进来拉，准备调用服务提供方timeOut的方法");
        return paymentHystrixFeignService.paymentInfo_timeOut(id);
    }
    /**
     * create by: Wilson.lai
     * description: paymentInfo_timeOut服务的Fallback处理方法
     * create time: 2020/11/1
     *
     * @param id paymentInfo_timeOut的入参
     * @return
     */
    public String paymentInfo_timeOutFallback(Integer id){
        return "客户端反馈：调用支付服务超时或异常：" + "当前线程池名称：" + Thread.currentThread().getName() + "   paymentInfo_timeOut,  Id:" + id;
    }

    public String paymentConsumerDefaultFallback(){
        return "我是默认的兜底方法啊啊啊啊";
    }
}
