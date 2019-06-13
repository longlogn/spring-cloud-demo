import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * className ZuulApplication
 * description ZuulApplication
 *
 * @author Toby
 * @date 2019-6-12
 */
@SpringBootApplication(scanBasePackages = {"com.cxlsky"})
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
