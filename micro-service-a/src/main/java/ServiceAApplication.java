import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * className EurekaClientA
 * description EurekaClientA
 *
 * @author Toby
 * @date 2019-6-11
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.cxlsky")
@EnableFeignClients(basePackages={"com.cxlsky"})
public class ServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }

}
