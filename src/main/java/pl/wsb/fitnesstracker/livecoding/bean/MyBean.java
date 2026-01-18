package pl.wsb.fitnesstracker.livecoding.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * The type My bean.
 */
@Profile("BeanCycle")
@Service
public class MyBean {

    /**
     * Instantiates a new My bean.
     */
    public MyBean() {
        System.out.println("Instantiation");
    }

    /**
     * Init.
     */
    @PostConstruct
    public void init() {
        System.out.println("Initializing..");
    }

    /**
     * Destroy.
     */
    @PreDestroy
    public void destroy() {
        System.out.println("Destroying..");
    }
}
