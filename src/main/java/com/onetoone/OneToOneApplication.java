package com.onetoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.ono", "com.onetoone"})
@EnableJpaRepositories(basePackages = {"com.ono.repository"})
@EntityScan(basePackages = {"com.ono.entity"})
public class OneToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneToOneApplication.class, args);
    }

}
