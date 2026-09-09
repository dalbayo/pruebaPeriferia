package co.gtcloud.riopaila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// Excluimos la configuraciÃ³n de seguridad automÃ¡tica aquÃ­
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = "co.gtcloud.riopaila")
public class RioPailaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RioPailaApplication.class, args);
    }
}
