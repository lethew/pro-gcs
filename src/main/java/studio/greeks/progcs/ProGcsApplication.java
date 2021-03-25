package studio.greeks.progcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author Zhao
 */
@EnableJpaAuditing
@SpringBootApplication
public class ProGcsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProGcsApplication.class, args);
    }

}
