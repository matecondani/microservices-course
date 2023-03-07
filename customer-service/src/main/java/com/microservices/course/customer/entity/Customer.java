package com.microservices.course.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * This class represents a basic customer.
 */
@Entity
public class Customer {

    @Id
    Long id;

    private String name;
    private String phone;

    public Customer() {
        //No-args constructor
    }

    public Customer(Long id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
