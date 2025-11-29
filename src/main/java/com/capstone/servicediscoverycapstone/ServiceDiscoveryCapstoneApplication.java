package com.capstone.servicediscoverycapstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryCapstoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryCapstoneApplication.class, args);
    }

}
