import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * className ConfigServerApplication
 * description ConfigServerApplication
 *
 * @author Toby
 * @date 2019-6-12
 */
@SpringBootApplication(scanBasePackages = {"com.cxlsky"})
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
