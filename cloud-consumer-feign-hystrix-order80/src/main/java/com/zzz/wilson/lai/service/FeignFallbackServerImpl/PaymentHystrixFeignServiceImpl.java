package com.zzz.wilson.lai.service.FeignFallbackServerImpl;

import com.zzz.wilson.lai.service.PaymentHystrixFeignService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/4 23:59
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Component
public class PaymentHystrixFeignServiceImpl implements PaymentHystrixFeignService {
    @Override
    public String paymentInfo_ok(Integer id) {
        return "我是Feign接口的服务降级方法啦————PaymentHystrixFeignServiceImpl.paymentInfo_ok脏活累活我来好吧，还你Id：" + id;
    }

    @Override
    public String paymentInfo_timeOut(Integer id) {
        return "我是Feign接口的服务降级方法啦————PaymentHystrixFeignServiceImpl.paymentInfo_timeOut脏活累活我来好吧，还你Id：" + id;
    }
}
