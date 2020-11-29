package com.zzz.wilson.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/24 22:21
 * @ Description：自定义Ribbon的服务调用算法
 * @ Modified By：
 * @ Version:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机
    }
}
