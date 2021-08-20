package org.hibernaterelations.repository;

import org.hibernaterelations.domain.Customer;
import org.hibernaterelations.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
