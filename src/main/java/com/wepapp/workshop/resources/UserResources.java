package com.wepapp.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wepapp.workshop.entity.User;
import com.wepapp.workshop.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserResources {

	@Autowired
	private UserServices service;
	
	@GetMapping
	public ResponseEntity<List<User>> findall() {	
		List<User> list = service.findall();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
