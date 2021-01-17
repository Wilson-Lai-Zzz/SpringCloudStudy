package lai.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2021/1/17 14:04
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
public class PaymentControl {
    @Value("${server.port}")
    private String servicePot;
    @RequestMapping("getProviderPayment/{stringId}")
    public String getProviderPayment(@PathVariable("stringId") String stringId){
        log.info("有来客，见面礼是：" + stringId);
        return "访问服务的端口为：" + servicePot + "，路径参数为：" + stringId;
    }
}
