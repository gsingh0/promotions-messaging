package com.vmware.messaging.service.controllers;


import com.vmware.messaging.service.dto.SubscriptionRequest;
import com.vmware.messaging.service.dto.SubscriptionResponse;
import com.vmware.messaging.service.entities.Subscription;
import com.vmware.messaging.service.mapper.SubscriptionMapper;
import com.vmware.messaging.service.repository.MessagingRepository;
import com.vmware.messaging.service.services.SubscriptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
public class SubscriptionServiceController implements SubscriptionService {

    private static final Logger LOG = LoggerFactory.getLogger(SubscriptionServiceController.class);

    @Resource
    MessagingRepository messagingRepository;

    @Resource
    SubscriptionMapper subscriptionMapper;

    @Override
    public SubscriptionResponse createSubscription(@Valid @RequestBody SubscriptionRequest subscriptionRequest)
            throws IllegalArgumentException {
        Subscription subscription = subscriptionMapper.mapToEntity(subscriptionRequest);

        LOG.info("Attempting to save subscription with email " + subscription.getEmail());
        subscription = messagingRepository.save(subscription);
        LOG.info("Subscription with id '" + subscription.getId() + "' saved successfully");

        return subscriptionMapper.mapToDto(subscription);
    }
}
