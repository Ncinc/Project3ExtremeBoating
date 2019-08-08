package com.boating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boating.models.UserModel;
import com.boating.repo.UserRepo;


@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<UserModel> findAll() {
		return userRepo.findAll();
	}
	
	public UserModel findByUserName(String username) {

		List<UserModel> userList = userRepo.findUsingNameHQL(username);
		if(userList.size() == 0 )
		{
			return null;
		}
		return userList.get(0);
	}
	
	public UserModel findById(int id) {

		List<UserModel> idList = userRepo.findUsingIdHQL(id);
		if(idList.size() == 0 )
		{
			return null;
		}
		return idList.get(0);
	}
	
	public UserModel findByFname(String firstname) {

		List<UserModel> fnList = userRepo.findFnameHQL(firstname);
		if(fnList.size() == 0 )
		{
			return null;
		}
		return fnList.get(0);
	}
	
	
	public UserModel save (UserModel u) {
		return userRepo.save(u);
	}

}
