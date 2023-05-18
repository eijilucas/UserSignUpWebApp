package com.wepapp.workshop.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wepapp.workshop.model.User;

@RestController
@RequestMapping("/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findall() {
		 User u = new User(null, "Jonas", "jonas@gmail.com", "12-1212-1212", "jonas123");
		 return ResponseEntity.ok().body(u);
	}
}
