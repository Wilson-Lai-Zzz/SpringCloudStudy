package com.zzz.wilson.lai;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/1 19:19
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class CloudFeignHistrixOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudFeignHistrixOrderMain80.class, args);
    }
    /**
     * 此配置是为了服务监控而配置，与服务容错本身无关，SpringCloud升级后的坑
     * ServletRegistrationBean因为SpringBoot默认路径不是“/hystrix.stream”
     * 只有在直接的项目里配置上下面的servlet就可以
     * */
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
