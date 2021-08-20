package org.hibernaterelations.services;

import org.hibernaterelations.domain.Customer;
import org.hibernaterelations.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServicesImp implements CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public void addCustomers(Customer customer) {
        //customer.setC_name(customer.getC_name());
        //customer.setAddress(customer.getAddress());
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer, Integer id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            customer = optionalCustomer.get();
        }

        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> getCustomerById(Integer id) {
        Optional<Customer> optionalCustomer = customerRepository.findById((Integer) id);
        if (optionalCustomer.isPresent()) {
            return Optional.of(optionalCustomer.get());
        }
        return optionalCustomer;
    }
}
