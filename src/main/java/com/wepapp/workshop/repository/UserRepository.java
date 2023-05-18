package com.wepapp.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wepapp.workshop.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
