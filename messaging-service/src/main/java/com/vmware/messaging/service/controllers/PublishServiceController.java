package com.vmware.messaging.service.controllers;

import com.vmware.messaging.service.entities.Subscription;
import com.vmware.messaging.service.repository.MessagingRepository;
import com.vmware.messaging.service.services.PublishService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PublishServiceController implements PublishService {

    private static final Logger LOG = LoggerFactory.getLogger(PublishServiceController.class);

    @Resource
    MessagingRepository messagingRepository;

    @Override
    public void notifyAllSubscribers() {
        LOG.info("Attempting to fetch all subscribers");
        Iterable<Subscription> subscriptionList = messagingRepository.findAll();
        LOG.info("Sending notifications to subscriber list");
        subscriptionList.forEach((subscription) -> {
            // send emails
        });
    }
}
