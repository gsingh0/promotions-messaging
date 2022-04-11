package com.vmware.messaging.service.dto;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author gurnoorsingh
 */
@Validated
public class SubscriptionRequest implements Serializable {

    /**
     * first name of subscriber
     */
    @NotNull
    private String firstName;

    /**
     * last name of subscriber
     */
    @NotNull
    private String lastName;

    /**
     * email of subscriber
     */
    @NotNull
    @Email
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
