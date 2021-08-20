package org.hibernaterelations.services;

import org.hibernaterelations.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerServices {
    void addCustomers(Customer customer);

    void deleteCustomer(Integer id);

    List<Customer> getAllCustomers();

    Customer updateCustomer(Customer customer, Integer id);

     Optional<Customer> getCustomerById(Integer id);
}
