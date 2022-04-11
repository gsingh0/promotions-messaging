package com.vmware.messaging.service.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;

@RequestMapping("/publish")
public interface PublishService {

    /**
     * Notifies all subscribers of a new promotion via. email
     * @throws MessagingException
     */
    @PostMapping("/notifyAll")
    void notifyAllSubscribers() throws MessagingException;

}
