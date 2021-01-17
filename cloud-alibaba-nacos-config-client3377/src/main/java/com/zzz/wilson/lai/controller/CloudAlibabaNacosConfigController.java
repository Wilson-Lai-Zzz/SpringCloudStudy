package com.zzz.wilson.lai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2021/1/17 17:47
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@RefreshScope //支持Nacosde的动态刷新
@Slf4j
public class CloudAlibabaNacosConfigController {
    @Value("${config.info}")
    private String configInfo;
    @RequestMapping("nacos/config/getConfigInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
