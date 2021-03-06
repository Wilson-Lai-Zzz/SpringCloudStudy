package com.zzz.wilson.lai.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/21 23:01
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//开启负载均衡：在RestTemplate的配置bean添加注解
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
