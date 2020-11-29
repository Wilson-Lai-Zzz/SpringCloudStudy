package com.zzz.wilson.lai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/22 16:55
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@RefreshScope
@Slf4j
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configClient/getConfigInfo")
    public String getConfigInfo(){
        return "serverPort:" + serverPort + "  configInfo:" + configInfo;
    }
}
