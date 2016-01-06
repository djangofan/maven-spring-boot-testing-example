package example.spring.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

// from https://spring.io/guides/gs/spring-boot/
@SpringBootApplication
@Configuration
@ImportResource("classpath:spring-mvc-config.xml")
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("List of beans provided by Spring-Boot: ");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
