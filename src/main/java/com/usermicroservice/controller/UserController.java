package com.usermicroservice.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.usermicroservice.model.User;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

	/*
	 * @RequestMapping("/users") public String user(@RequestBody User user) { return
	 * "User " + user.getEmail() + "Created"; }
	 */
	
	HashMap<String,User> maps = new HashMap<>();
	
	@PostMapping
	public ResponseEntity<String> sayhello(@RequestBody User user) {
		maps.put(user.getEmail(), user);
		System.out.println(user.getEmail()+"  "+ user.getMobile());
		return new ResponseEntity<String>("Hello Student", HttpStatus.OK);	}

}

