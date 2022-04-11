package com.vmware.messaging.service.transporters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author gurnoorsingh
 */
public class EmailTransporter implements Transporter {

    /**
     * send address as part of the mail configuration
     */
    @Value("${email.accounts.publisher-username}")
    private String senderAddress;

    /**
     * subject as part of the mail configuration
     */
    private static final String subject = "VMware Promotions";

    /**
     * mail session configuration
     */
    private Session session;

    public EmailTransporter(Session session) {
        this.session = session;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void send(String[] recipients) throws MessagingException {
        // message objects
        MimeMessage message = new MimeMessage(this.session);
        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);

        // set attributes
        messageHelper.setFrom(new InternetAddress(senderAddress));
        messageHelper.setTo(recipients);
        messageHelper.setSubject(subject);
        messageHelper.setText("carpe diem");

        // send mail
        Transport.send(message);
    }
}
