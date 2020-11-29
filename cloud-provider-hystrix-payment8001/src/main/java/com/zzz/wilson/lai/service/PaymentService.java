package com.zzz.wilson.lai.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/28 23:38
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Service
public class PaymentService {

    /**
     * 正常访问方法
     * */
    public String paymentInfo_ok(Integer id){
        Integer a = 1/0;
        return "线程池：" + Thread.currentThread().getName() + "  paymentInfo_ok,  Id" + id;
    }
    /**
     * 模拟异常
     * */
    @HystrixCommand(fallbackMethod = "paymentInfo_timeOutFallback", //兜底处理方法
            commandProperties = {//command的配置
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_timeOut(Integer id){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_timeOut,  Id:" + id;
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
        return "调用支付服务超时或异常：" + "当前线程池名称：" + Thread.currentThread().getName() + "   paymentInfo_timeOut,  Id:" + id;
    }

    /************************************************服务熔断***********************************************************/
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",//fallback方法
    commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//是否开启短路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")//失败率达到多少后跳匝
    }
    )
    //业务处理方法
    public String paymentCircutBreaker(Integer id){
        if( id < 0){
            throw new RuntimeException("******id不能是负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水：" + serialNumber;
    }
    //fallback方法
    public String paymentCircuitBreaker_fallback(Integer id){
        return "id 不能负数，请稍后在试，id：" + id;
    }

}
