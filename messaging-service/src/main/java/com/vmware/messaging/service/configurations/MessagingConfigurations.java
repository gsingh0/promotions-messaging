package com.vmware.messaging.service.configurations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vmware.messaging.service.mapper.SubscriptionMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagingConfigurations {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public SubscriptionMapper subscriptionMapper() {
        return new SubscriptionMapper();
    }

}
