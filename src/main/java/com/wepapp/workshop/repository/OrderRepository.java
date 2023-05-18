package com.wepapp.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wepapp.workshop.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
