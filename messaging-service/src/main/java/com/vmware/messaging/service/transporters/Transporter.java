package com.vmware.messaging.service.transporters;

import javax.mail.MessagingException;

/**
 * @author gurnoorsingh
 */
public interface Transporter {

    /**
     * Sends a notification via. communication medium
     * @param recipients list of recipients
     * @throws MessagingException
     */
    void send(String[] recipients) throws MessagingException;

}
