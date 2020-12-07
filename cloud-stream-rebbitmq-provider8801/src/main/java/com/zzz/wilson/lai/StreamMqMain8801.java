package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/12/7 22:45
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMqMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMqMain8801.class, args);
    }
}
