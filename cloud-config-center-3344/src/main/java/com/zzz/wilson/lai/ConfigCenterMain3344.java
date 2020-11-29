package com.zzz.wilson.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/21 23:40
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableConfigServer //开启Spring Cloud Config的服务端
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
