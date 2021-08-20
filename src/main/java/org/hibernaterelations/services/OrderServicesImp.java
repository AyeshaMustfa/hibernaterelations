package org.hibernaterelations.services;

import org.hibernaterelations.domain.Order;
import org.hibernaterelations.model.OrderRequest;
import org.hibernaterelations.repository.CustomerRepository;
import org.hibernaterelations.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServicesImp implements OrderServices{

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void placeOrder(Order order) {
//        order.setOrder_type(order.getOrder_type());
          orderRepository.save(order);

    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteOrderById(Integer o_id) {
        orderRepository.deleteById(o_id);
    }

    @Override
    public Optional<Order> findOrderById(Integer o_id) {
        return orderRepository.findById(o_id);
    }
}
