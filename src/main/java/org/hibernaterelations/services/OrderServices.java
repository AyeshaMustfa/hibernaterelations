package org.hibernaterelations.services;

import org.hibernaterelations.domain.Order;
import org.hibernaterelations.model.OrderRequest;

import java.util.List;
import java.util.Optional;

public interface OrderServices {

    void placeOrder(Order order);

    List<Order> getAllOrders();


    void deleteOrderById(Integer o_id);

    Optional<Order> findOrderById(Integer o_id);
}
