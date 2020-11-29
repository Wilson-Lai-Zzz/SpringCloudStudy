package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/24 12:21
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者Zookeeper作为注册中心时注册服务
public class PaymentConsulMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMain8005.class, args);
    }
}
