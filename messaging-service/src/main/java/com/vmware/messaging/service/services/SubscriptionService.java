package com.vmware.messaging.service.services;

import com.vmware.messaging.service.dto.SubscriptionRequest;
import com.vmware.messaging.service.dto.SubscriptionResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/subscriptions")
public interface SubscriptionService {

    /**
     * Creates a subscription
     * @param subscriptionRequest object containing information about subscription
     * @return response verifying subscription creation
     * @throws IllegalArgumentException
     */
    @PostMapping("/create")
    SubscriptionResponse createSubscription(SubscriptionRequest subscriptionRequest)
            throws IllegalArgumentException;

}
