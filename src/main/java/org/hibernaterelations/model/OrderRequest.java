package org.hibernaterelations.model;


import org.hibernaterelations.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderRequest {
    @Autowired
    private Customer customer;
}
