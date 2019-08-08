package com.boating.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.boating.models.UserModel;

	public interface UserRepo  extends JpaRepository<UserModel, Integer> {


//		the following is wrong and will cause a failed build
//		List<User> findByNametest(String nametest);
		// this is the right version
		
		//The follwoing is Autoprovision
		//List<User> findByName(String name);
		// an alternate version using hql
		@Query("FROM UserModel userModel WHERE userModel.username = :username")
		List<UserModel> findUsingNameHQL(String username);
		
		@Query("FROM UserModel userModel WHERE userModel.userid = :userid")
		List<UserModel> findUsingIdHQL(int userid);
		
		@Query("FROM UserModel userModel WHERE userModel.firstname = :firstname")
		List<UserModel> findFnameHQL(String firstname);
	}
