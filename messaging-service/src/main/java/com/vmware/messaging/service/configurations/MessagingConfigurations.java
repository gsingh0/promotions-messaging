package com.vmware.messaging.service.configurations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vmware.messaging.service.mapper.SubscriptionMapper;
import com.vmware.messaging.service.transporters.EmailTransporter;
import com.vmware.messaging.service.transporters.Transporter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

/**
 * @author gurnoorsingh
 */
@Configuration
public class MessagingConfigurations {

    @Value("${email.accounts.publisher-username}")
    String publisherUsername;

    @Value("${email.accounts.publisher-password}")
    String publisherPassword;

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public SubscriptionMapper subscriptionMapper() {
        return new SubscriptionMapper();
    }

    @Bean
    public Transporter emailTransporter() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(publisherUsername, publisherPassword);
            }
        });
        return new EmailTransporter(session);
    }

}
