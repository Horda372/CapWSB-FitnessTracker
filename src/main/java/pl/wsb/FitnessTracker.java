package pl.wsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The type Fitness tracker.
 */
@EntityScan(basePackages = "pl.wsb.fitnesstracker")
@EnableJpaRepositories(basePackages = "pl.wsb.fitnesstracker")
@SpringBootApplication
public class FitnessTracker {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(FitnessTracker.class, args);
    }

}
