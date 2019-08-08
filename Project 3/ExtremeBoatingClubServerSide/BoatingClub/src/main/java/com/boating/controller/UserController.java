package com.boating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boating.models.UserModel;
import com.boating.service.UserService;



@RestController
@RequestMapping("ExtremeBoatingClub/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping()
	public List<UserModel> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("username/{username}")
	public UserModel findByUserName(@PathVariable String username) {
		return userService.findByUserName(username);
	}
	
	@GetMapping("id/{id}")
	public UserModel findById(@PathVariable int id) {
		return userService.findById(id);
	}
	
	@GetMapping("firstname/{firstname}")
	public UserModel findByFname(@PathVariable String firstname) {
		return userService.findByFname(firstname);
	}
	
	
	@PostMapping()
	public UserModel save (@RequestBody UserModel u) {
		return userService.save(u);
	}

}
