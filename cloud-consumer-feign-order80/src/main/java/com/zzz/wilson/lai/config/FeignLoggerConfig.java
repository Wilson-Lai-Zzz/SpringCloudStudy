package com.zzz.wilson.lai.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/25 23:43
 * @ Description：OpenFeign的日志配置类
 * @ Modified By：
 * @ Version:
 */
@Configuration
public class FeignLoggerConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.BASIC;
    }
}
