package com.vmware.messaging.service.controllers;

import com.vmware.messaging.service.entities.Subscription;
import com.vmware.messaging.service.repository.MessagingRepository;
import com.vmware.messaging.service.services.PublishService;
import com.vmware.messaging.service.transporters.EmailTransporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.util.List;

/**
 * @author gurnoorsingh
 */
@RestController
public class PublishServiceController implements PublishService {

    private static final Logger LOG = LoggerFactory.getLogger(PublishServiceController.class);

    /**
     * data access repository
     */
    @Resource
    MessagingRepository messagingRepository;

    /**
     * transporter object to send emails
     */
    @Resource
    EmailTransporter emailTransporter;

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyAllSubscribers() throws MessagingException {
        LOG.info("Attempting to fetch all subscribers");
        List<Subscription> subscriptionList = (List<Subscription>) messagingRepository.findAll();

        // extract emails from subscription objects
        String[] recipients = subscriptionList
                .stream()
                .map(Subscription::getEmail)
                .toArray(String[]::new);

        LOG.info("Sending email(s) to subscriber recipients");
        emailTransporter.sendEmail(recipients);
        LOG.info("Email(s) sent to recipients successfully");
    }
}
