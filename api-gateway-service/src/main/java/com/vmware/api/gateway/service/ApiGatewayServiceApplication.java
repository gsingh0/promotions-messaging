package com.vmware.api.gateway.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author gurnoorsingh
 */
@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayServiceApplication {

    private static final Logger LOG = LoggerFactory.getLogger(ApiGatewayServiceApplication.class);

    public static void main(String[] args) {
        LOG.info("Starting api-gateway service...");
        SpringApplication.run(ApiGatewayServiceApplication.class, args);
    }
}
