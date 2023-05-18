package com.wepapp.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wepapp.workshop.entity.Order;
import com.wepapp.workshop.repository.OrderRepository;

@Service
public class OrderServices {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findall() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}
