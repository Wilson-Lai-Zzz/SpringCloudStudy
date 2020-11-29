package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
* 程序启动入口
* */
@SpringBootApplication
@EnableEurekaClient//声明为Eureka的client
@EnableDiscoveryClient//对于注册进Eureka里面的微服务，可以通过服务来发现获取该服务的信息
public class payMentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(payMentMain8001.class,args);
    }
}
