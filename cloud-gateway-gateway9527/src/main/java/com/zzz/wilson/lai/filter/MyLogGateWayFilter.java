package com.zzz.wilson.lai.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/21 19:50
 * @ Description：自定义GateWay全局过滤器
 * @ Modified By：
 * @ Version:
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    
    /**
     * create by: Wilson.lai
     * description:过滤器业务内容
     * create time: 2020/11/21 
     * 
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("***************************进入过滤器MyLogGateWayFilter：" + new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (uname == null){
            log.info("**********************umane为空不允许");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }else if(!"zzz".equals(uname)){
            log.info("**********************uname非zzz不允许");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    
    /**
     * create by: Wilson.lai
     * description: 加载过滤器的顺序
     * create time: 2020/11/21 
     * 
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
