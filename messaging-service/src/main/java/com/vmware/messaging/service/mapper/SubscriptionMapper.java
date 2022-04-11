package com.vmware.messaging.service.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vmware.messaging.service.dto.SubscriptionRequest;
import com.vmware.messaging.service.dto.SubscriptionResponse;
import com.vmware.messaging.service.entities.Subscription;

import javax.annotation.Resource;

public class SubscriptionMapper {

    @Resource
    ObjectMapper objectMapper;

    public Subscription mapToEntity(SubscriptionRequest subscriptionRequest) {
        return objectMapper.convertValue(subscriptionRequest, Subscription.class);
    }

    public SubscriptionResponse mapToDto(Subscription subscription) {
        SubscriptionResponse subscriptionResponse = objectMapper.convertValue(subscription, SubscriptionResponse.class);

    }
}
