package com.zzz.wilson.lai.controller;

import com.zzz.wilson.lai.entities.CommentResult;
import com.zzz.wilson.lai.entities.PayMent;
import com.zzz.wilson.lai.service.PayMentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class PayMentController {
    @Autowired
    private PayMentService payMentService;
    @Value("${server.port}")
    private String serverPort;
    @PostMapping(value = "/payMent/create")
    public CommentResult create(@RequestBody PayMent payMent){
        Integer result = payMentService.create(payMent);
        log.info("插入数据库：" + result);
        if(result > 0){
            return new CommentResult(200, "插入数据库成功，调用服务提供者：" + serverPort);
        }else{
            return new CommentResult(444, "插入数据库失败，调用服务提供者：" + serverPort);
        }
    }
    @GetMapping(value = "/payMent/getPayMentById/{id}")
    public CommentResult getPayMentById(@PathVariable("id") Long id){
        PayMent result = payMentService.getPayMentById(id);
        if(result != null){
            return new CommentResult<PayMent>(200, "查询数据成功，调用服务提供者：" + serverPort, result);
        }else{
            return new CommentResult<PayMent>(444, "查询数据库失败，调用服务提供者：" + serverPort);
        }
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "我是端口号：" + serverPort + "的服务，我业务执行了1秒钟";
    }
}
