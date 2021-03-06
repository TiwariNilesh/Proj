package com.nilesh.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilesh.app.dto.User;
import com.nilesh.app.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User findUserByEmailOrMobileNoOrUserName(String loginData) {
		User user = userRepository.findUserByEmailOrMobileNoOrUserName(loginData);
		return user;
	}

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.addUser(user);
	}

	
	
	
	
	
	
	
	
	
}

