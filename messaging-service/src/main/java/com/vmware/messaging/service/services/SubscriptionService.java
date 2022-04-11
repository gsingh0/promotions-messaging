package com.vmware.messaging.service.services;

import com.vmware.messaging.service.dto.SubscriptionRequest;
import com.vmware.messaging.service.dto.SubscriptionResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/subscriptions")
public interface SubscriptionService {

    @PostMapping("/create")
    SubscriptionResponse createSubscription(SubscriptionRequest subscriptionRequest)
            throws IllegalArgumentException;

}
