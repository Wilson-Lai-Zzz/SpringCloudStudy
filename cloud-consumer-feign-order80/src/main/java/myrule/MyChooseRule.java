package myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/10/25 23:29
 * @ Description：配置我选择的负载均衡算法
 * @ Modified By：
 * @ Version:
 */
@Configuration
public class MyChooseRule {
    public IRule chooseRule(){
        return new RandomRule();
    }
}
