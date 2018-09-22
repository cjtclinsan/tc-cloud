package com.example.sbmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class ServiceConsumerTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerTurbineApplication.class, args);
    }
}
