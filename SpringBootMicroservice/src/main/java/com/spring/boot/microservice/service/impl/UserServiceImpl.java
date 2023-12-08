package com.spring.boot.microservice.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.microservice.entities.User;
import com.spring.boot.microservice.exception.ResouceNotFoundException;
import com.spring.boot.microservice.repository.UserRepository;
import com.spring.boot.microservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		int num = (int) userRepository.count();
		user.setUserId("User_" + (num + 1));
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()-> new ResouceNotFoundException("User with given id not found in the server !! : "+ userId));
	}

}
