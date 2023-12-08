package com.spring.boot.microservice.service;

import java.util.List;

import com.spring.boot.microservice.entities.User;

public interface UserService {

	User saveUser(User user);

	List<User> getAllUser();

	User getUser(String userId);
}
