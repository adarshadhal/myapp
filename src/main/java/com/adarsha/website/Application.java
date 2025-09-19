package com.adarsha.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // SpringApplicationBuilder helps in setting up the application configuration
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        // This starts the Spring Boot application
        SpringApplication.run(Application.class, args);
    }
}

