package com.rupine.profile.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rupine.profile.model.Address;
import com.rupine.profile.model.Profile;
import com.rupine.profile.model.UserDetail;

@Repository
public class ProfileRepo {
	
	private static  List<UserDetail> userDetailList = new ArrayList<UserDetail>();
	
	static {
		
		UserDetail userDetail1 = new UserDetail();
		UserDetail userDetail2 = new UserDetail();
		
		userDetail1.setProfile(new Profile("Yogesh","Dahiya"));
		
		userDetail1.setAddress(new Address("Delhi","India"));
		
		userDetail2.setProfile(new Profile("Monty","Singh"));
		
		userDetail2.setAddress(new Address("Chandigarh","India"));
		
		userDetailList.add(userDetail1);
		
		userDetailList.add(userDetail2);
		
	}
	public List<UserDetail> getUserProfile()
	{
		return userDetailList; 
	}

}
