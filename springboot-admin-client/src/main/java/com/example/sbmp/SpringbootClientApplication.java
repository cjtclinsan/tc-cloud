package com.example.sbmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootClientApplication.class, args);
    }
}
