package com.example.crudrestapi.model;

import jakarta.persistence.Column;

import java.math.BigDecimal;

public class CustomerDto {

    private String firstName;

    private String lastName;

    private BigDecimal budget;

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

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }
}
