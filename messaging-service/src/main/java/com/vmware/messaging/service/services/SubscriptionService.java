package com.vmware.messaging.service.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/subscriptions")
public interface SubscriptionService {

    @PostMapping("/create")
    void createSubscription(String body);
}
