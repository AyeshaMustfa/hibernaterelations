package org.hibernaterelations.controllers;

import org.hibernaterelations.domain.Customer;
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
    private CustomerServices customerServices;

    @GetMapping("/get-all-orders")
    public List<Order> getAllOrdersGet() {
        return orderServices.getAllOrders();
    }

    @PostMapping("/place-orders")
    public void SaveOrders(@RequestBody Order order) {
        orderServices.placeOrder(order);

    }

    @DeleteMapping("delete-order/{o_id}")
    public void deleteCustomer(@PathVariable Integer o_id) {
        orderServices.deleteOrderById(o_id);
    }

    @GetMapping("find-order-byId/{o_id}")
    public Optional<Order> findOrderById(@PathVariable Integer o_id) {
        return orderServices.findOrderById(o_id);

    }
}
