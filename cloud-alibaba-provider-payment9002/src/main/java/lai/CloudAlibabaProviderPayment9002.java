package lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2021/1/17 13:37
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaProviderPayment9002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaProviderPayment9002.class, args);
    }
}
