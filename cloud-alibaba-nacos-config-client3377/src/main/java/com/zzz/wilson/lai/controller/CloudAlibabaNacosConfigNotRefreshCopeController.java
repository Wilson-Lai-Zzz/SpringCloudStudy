package com.zzz.wilson.lai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2021/1/17 18:38
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
public class CloudAlibabaNacosConfigNotRefreshCopeController {
    @Value("${zzz.nami}")
    private String configInfozz;
    @RequestMapping("nacos/config/getNami")
    private String getConfigInfoToNotRefreshScope(){
        return configInfozz;
    }
}
