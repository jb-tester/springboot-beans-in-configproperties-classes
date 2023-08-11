package com.example.springbootbeansinconfigpropertiesclasses;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBeansInConfigpropertiesClassesApplication implements CommandLineRunner {

    private final UseBeans useBeans;

    public SpringbootBeansInConfigpropertiesClassesApplication(UseBeans useBeans) {
        this.useBeans = useBeans;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBeansInConfigpropertiesClassesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       useBeans.displayAll();
    }
}
