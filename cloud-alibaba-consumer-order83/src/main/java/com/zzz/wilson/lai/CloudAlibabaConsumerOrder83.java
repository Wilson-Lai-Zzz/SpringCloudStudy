package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2021/1/17 14:52
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConsumerOrder83 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumerOrder83.class, args);
    }
}
