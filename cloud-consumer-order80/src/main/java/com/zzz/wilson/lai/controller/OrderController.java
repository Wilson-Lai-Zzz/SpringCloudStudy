package com.zzz.wilson.lai.controller;

import com.zzz.wilson.lai.entities.CommentResult;
import com.zzz.wilson.lai.entities.PayMent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/14 23:07
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
public class OrderController {

    private static String serverUrl= "http://CLOUD-PAYMENT-SERVICE";//通过服务名称到Eureka Server中进行获取服务提供者
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/create")
    public CommentResult<PayMent> create(PayMent payMent){
        return restTemplate.postForObject(serverUrl + "/payMent/create", payMent, CommentResult.class);
    }
    @GetMapping(value = "/consumer/payment/getPayMentById/{id}")
    public CommentResult<PayMent> getPayMentById(@PathVariable("id") Long id){
        log.info("进来了");
        return restTemplate.getForObject(serverUrl + "/payMent/getPayMentById/" + id, CommentResult.class);
    }
    @GetMapping(value = "/consumer/payment/getPayMentById2/{id}")
    public CommentResult<PayMent> getPayMentById2(@PathVariable("id") Long id){
        log.info("进来了,使用GetForEntity请求");
        ResponseEntity<CommentResult> responseEntity = restTemplate.getForEntity(serverUrl + "/payMent/getPayMentById/" + id, CommentResult.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            log.info(responseEntity.getStatusCode()+ "\t" + responseEntity.getHeaders());
            return responseEntity.getBody();
        }else {
            log.info(responseEntity.getStatusCode()+ "\t" + responseEntity.getHeaders());
            return new CommentResult<PayMent>(444, "请求反馈不是2xx状态码呀兄弟");
        }
    }

    @GetMapping(value = "/consumer/payment/getPayMentById3/{id}")
    public CommentResult<PayMent> getPayMentById3(@PathVariable("id") Long id){
        log.info("进来了,使用GetForEntity请求");
        ResponseEntity<CommentResult> responseEntity = restTemplate.postForEntity(serverUrl + "/payMent/getPayMentById/" + id,"我是请求内容", CommentResult.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            log.info(responseEntity.getStatusCode()+ "\t" + responseEntity.getHeaders());
            return responseEntity.getBody();
        }else {
            log.info(responseEntity.getStatusCode()+ "\t" + responseEntity.getHeaders());
            return new CommentResult<PayMent>(444, "请求反馈不是2xx状态码呀兄弟");
        }
    }
}
