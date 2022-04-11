package com.vmware.messaging.service.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vmware.messaging.service.Constants;
import com.vmware.messaging.service.dto.SubscriptionRequest;
import com.vmware.messaging.service.dto.SubscriptionResponse;
import com.vmware.messaging.service.entities.Subscription;

import javax.annotation.Resource;

/**
 * @author gurnoorsingh
 */
public class SubscriptionMapper {

    /**
     * used to map DTOs to domain objects and vice versa
     */
    @Resource
    ObjectMapper objectMapper;

    /**
     * Map a DTO to an domain object
     * @param subscriptionRequest DTO
     * @return domain object
     */
    public Subscription mapToEntity(SubscriptionRequest subscriptionRequest) {
        return objectMapper.convertValue(subscriptionRequest, Subscription.class);
    }

    /**
     * Map a domain object to a DTO
     * @param subscription domain object
     * @return DTO
     */
    public SubscriptionResponse mapToDto(Subscription subscription) {
        SubscriptionResponse subscriptionResponse = objectMapper.convertValue(subscription, SubscriptionResponse.class);
        subscriptionResponse.setMessage(Constants.subscriptionResponseOkMessage);
        return subscriptionResponse;
    }
}
