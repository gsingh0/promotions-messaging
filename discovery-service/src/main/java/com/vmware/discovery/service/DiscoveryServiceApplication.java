package com.vmware.discovery.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceApplication {

    private static final Logger LOG = LoggerFactory.getLogger(DiscoveryServiceApplication.class);

    public static void main(String[] args) {
        LOG.info("Starting discovery-service registry...");
        SpringApplication.run(DiscoveryServiceApplication.class, args);
    }
}
