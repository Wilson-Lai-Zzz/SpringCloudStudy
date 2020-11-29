package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/18 13:25
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
    }
}
