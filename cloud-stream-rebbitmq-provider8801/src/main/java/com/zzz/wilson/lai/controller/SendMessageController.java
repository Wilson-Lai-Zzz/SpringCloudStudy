package com.zzz.wilson.lai.controller;

import com.zzz.wilson.lai.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/12/7 23:09
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
public class SendMessageController {
    @Autowired
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "sendMessage")
    public String sendMessage(){
        return iMessageProvider.send();
    }
}
