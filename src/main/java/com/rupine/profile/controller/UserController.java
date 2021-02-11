package com.rupine.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rupine.profile.model.UserDetail;
import com.rupine.profile.service.ProfileService;

@RestController
public class UserController {
	
	@Autowired
	ProfileService profileService;
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello World";
	}
	
	@GetMapping("/profile")
	public List<UserDetail> getUserProfile()
	{
		return profileService.getUserProfile();
	}

}
