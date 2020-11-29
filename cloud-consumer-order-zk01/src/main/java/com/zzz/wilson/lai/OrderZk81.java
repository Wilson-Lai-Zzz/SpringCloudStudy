package com.zzz.wilson.lai;

import cn.hutool.db.sql.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/21 22:58
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZk81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZk81.class, args);
    }
}
