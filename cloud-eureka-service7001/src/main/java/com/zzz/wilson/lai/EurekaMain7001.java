package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/17 23:07
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableEurekaServer//声明为Eureka的服务注册中心
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
