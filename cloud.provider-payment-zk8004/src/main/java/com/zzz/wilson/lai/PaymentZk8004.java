package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/21 23:29
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZk8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZk8004.class, args);
    }
}
