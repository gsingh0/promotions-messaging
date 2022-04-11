package com.vmware.messaging.service.entities;

import javax.persistence.*;


@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Basic
    @Column
    public String firstName;

    @Basic
    @Column
    public String lastName;

    @Basic
    @Column
    public String email;

    public Subscription() { }

    public Subscription(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
