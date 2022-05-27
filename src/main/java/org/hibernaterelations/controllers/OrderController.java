package org.hibernaterelations.controllers;

import org.hibernaterelations.domain.Order;
import org.hibernaterelations.model.OrderRequest;
import org.hibernaterelations.services.CustomerServices;
import org.hibernaterelations.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServices orderServices;


    @GetMapping("/get-all-orders")
    public List<Order> getAllOrdersGet() {
        return orderServices.getAllOrders();
    }

    @PostMapping("/place-orders")
    public void SaveOrders(@RequestBody Order order) {
        orderServices.placeOrder(order);

    }

    @DeleteMapping("delete-order/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        orderServices.deleteOrderById(id);
    }

    @GetMapping("find-order-byId/{id}")
    public Optional<Order> findOrderById(@PathVariable Integer id) {
        return orderServices.findOrderById(id);

    }
}
