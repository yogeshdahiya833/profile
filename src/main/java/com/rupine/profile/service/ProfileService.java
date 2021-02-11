package com.rupine.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rupine.profile.model.UserDetail;
import com.rupine.profile.repository.ProfileRepo;

@Service
public class ProfileService {
	
	@Autowired
	ProfileRepo repo;
	
	public List<UserDetail> getUserProfile(){
		return repo.getUserProfile();
	}

}
