import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * className EurekaClientBApplication
 * description EurekaClientBApplication
 *
 * @author Toby
 * @date 2019-6-11
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.cxlsky"})
@EnableFeignClients(basePackages = {"com.cxlsky"})
public class ServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class, args);
    }


}
