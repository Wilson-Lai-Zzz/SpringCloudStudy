package com.zzz.wilson.lai;

import myrule.MyChooseRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/25 17:30
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableFeignClients//开启使用Feign
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyChooseRule.class)
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
