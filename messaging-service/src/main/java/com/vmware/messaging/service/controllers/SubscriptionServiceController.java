package com.vmware.messaging.service.controllers;


import com.vmware.messaging.service.dto.SubscriptionRequest;
import com.vmware.messaging.service.dto.SubscriptionResponse;
import com.vmware.messaging.service.entities.Subscription;
import com.vmware.messaging.service.mapper.SubscriptionMapper;
import com.vmware.messaging.service.repository.SubscriptionRepository;
import com.vmware.messaging.service.services.SubscriptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SubscriptionServiceController implements SubscriptionService {

    private static final Logger LOG = LoggerFactory.getLogger(SubscriptionServiceController.class);

    @Resource
    SubscriptionRepository subscriptionRepository;

    @Resource
    SubscriptionMapper subscriptionMapper;

    @Override
    public SubscriptionResponse createSubscription(SubscriptionRequest subscriptionRequest) {
        Subscription subscription = subscriptionMapper.mapToEntity(subscriptionRequest);
        subscriptionRepository.save(subscription);

    }
}
