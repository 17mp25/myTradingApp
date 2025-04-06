package com.manoj.trading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.trading.model.User;
import com.manoj.trading.repository.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private UserRepository userRepository;

	public ResponseEntity<User> register(User user) {
		User savedUser = new User();
		savedUser.setEmail(null);
		return null;

	}
}
