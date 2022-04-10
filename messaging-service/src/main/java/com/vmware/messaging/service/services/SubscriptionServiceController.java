package com.vmware.messaging.service.services;


public class SubscriptionServiceController implements SubscriptionService {

    @Override
    public void createSubscription(String body) {
        System.out.println("subscription created");
    }
}
