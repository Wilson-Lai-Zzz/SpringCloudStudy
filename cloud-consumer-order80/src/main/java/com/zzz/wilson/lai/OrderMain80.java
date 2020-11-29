package com.zzz.wilson.lai;

import com.zzz.wilson.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/14 23:00
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableEurekaClient//声明为Eureka的client
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)//name是服务提供者的名称，configuration是自定义的Rule
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
