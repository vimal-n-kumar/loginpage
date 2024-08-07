package com.accenture.loginpage.controllers;

import java.util.concurrent.ExecutionException;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.loginpage.entities.User;
import com.accenture.loginpage.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;

//	@PostMapping("/users")
//	public ResponseEntity<String> saveUser(@RequestBody User user) throws InterruptedException, ExecutionException{
//		String savedUser = userService.saveUser(user);
//		return new ResponseEntity<String>(savedUser, null, HttpStatus.SC_CREATED);
//	}
	
	@PostMapping("/users")
	public String saveUser(@RequestBody User user) throws InterruptedException, ExecutionException{
		return userService.saveUser(user);
	}
	
}
