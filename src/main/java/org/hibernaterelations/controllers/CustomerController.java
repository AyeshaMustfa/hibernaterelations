package org.hibernaterelations.controllers;

import org.hibernaterelations.domain.Customer;
import org.hibernaterelations.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;


    @PostMapping("/add-customer")
    public void SaveCustomers(@RequestBody Customer customer){

        customerServices.addCustomers(customer);
    }

    @GetMapping("/get-all-customers")
    public List<Customer> getAllCustomers(){
      return   customerServices.getAllCustomers();
    }

    @GetMapping("/get-customer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Integer id){
      return  customerServices.getCustomerById(id);

    }

    @DeleteMapping("/delete-customer/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerServices.deleteCustomer(id);
    }

    @PutMapping("/update-customer/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Integer id){
        return customerServices.updateCustomer(customer,id);

    }



}
