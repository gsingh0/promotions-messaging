package com.vmware.messaging.service.dto;

import java.io.Serializable;

/**
 * @author gurnoorsingh
 */
public class SubscriptionResponse implements Serializable {

    /**
     * id of subscriber
     */
    private long id;

    /**
     * first name of subscriber
     */
    private String firstName;

    /**
     * last name of subscriber
     */
    private String lastName;

    /**
     * email of subscriber
     */
    private String email;

    /**
     * message response sent back to client
     */
    private String message;

    private String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
