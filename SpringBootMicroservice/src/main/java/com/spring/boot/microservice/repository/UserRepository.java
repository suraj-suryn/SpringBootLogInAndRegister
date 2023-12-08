package com.spring.boot.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.microservice.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
