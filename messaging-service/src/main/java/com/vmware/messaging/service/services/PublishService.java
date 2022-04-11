package com.vmware.messaging.service.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/publish")
public interface PublishService {

    @PostMapping("/notifyAll")
    void notifyAllSubscribers();

}
