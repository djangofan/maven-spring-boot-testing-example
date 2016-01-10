package example.spring.bootapp;

import org.springframework.boot.SpringApplication;
import java.util.Arrays;
import java.util.logging.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.SpringVersion;

// source code example came from https://spring.io/guides/gs/spring-boot/
@SpringBootApplication
public class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        LOGGER.info("SPRING VERSION: " + SpringVersion.getVersion());
        System.out.println("List of beans provided by Spring-Boot: ");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            LOGGER.info("BEAN: " + beanName);
        }
    }

}
