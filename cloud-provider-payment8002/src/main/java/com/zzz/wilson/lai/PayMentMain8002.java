package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
* 程序启动入口
* */
@SpringBootApplication
@EnableEurekaClient//声明为Eureka的client
public class PayMentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8002.class,args);
    }
}
