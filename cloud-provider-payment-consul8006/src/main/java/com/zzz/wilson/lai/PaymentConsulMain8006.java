package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/24 13:14
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMain8006.class, args);
    }
}
