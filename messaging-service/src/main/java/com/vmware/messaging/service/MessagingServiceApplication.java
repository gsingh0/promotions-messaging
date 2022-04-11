package com.vmware.messaging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MessagingServiceApplication {

    private static final Logger LOG = LoggerFactory.getLogger(MessagingServiceApplication.class);

    public static void main(String[] args) {
        LOG.info("Running messaging-service client...");
        SpringApplication.run(MessagingServiceApplication.class, args);
    }
}
