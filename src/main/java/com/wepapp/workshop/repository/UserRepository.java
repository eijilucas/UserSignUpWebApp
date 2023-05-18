package com.wepapp.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wepapp.workshop.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
