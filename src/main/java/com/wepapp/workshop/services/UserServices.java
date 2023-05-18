package com.wepapp.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wepapp.workshop.model.User;
import com.wepapp.workshop.repository.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findall() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
}
