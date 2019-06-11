import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * className EurekaServerApplication
 * description EurekaServerApplication
 *
 * @author Toby
 * @date 2019-6-11
 */
@SpringBootApplication(scanBasePackages = "com.cxlsky")
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
