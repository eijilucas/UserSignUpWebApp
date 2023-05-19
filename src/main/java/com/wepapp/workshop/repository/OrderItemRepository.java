package com.wepapp.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wepapp.workshop.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
