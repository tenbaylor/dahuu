package com.dahuu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.dahuu")
public class DahuuApplication {

    public static void main(String[] args) {
        SpringApplication.run(DahuuApplication.class, args);
    }
}