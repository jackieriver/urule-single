package com.river;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:context.xml"})
public class UruleSingletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(UruleSingletonApplication.class, args);
    }

}
