package com.boating.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.boating.models.BoatModel;


public interface BoatRepo  extends JpaRepository<BoatModel, Integer> {


//	the following is wrong and will cause a failed build
//	List<User> findByNametest(String nametest);
	// this is the right version
	
	//The follwoing is Autoprovision
	//List<User> findByName(String name);
	// an alternate version using hql
	@Query("FROM BoatModel boatModel WHERE boatModel.boatname = :boatname")
	List<BoatModel> findUsingNameHQL(String boatname);
	
	@Query("FROM BoatModel boatModel WHERE boatModel.boatid = :boatid")
	List<BoatModel> findUsingIdHQL(int boatid);
	
}
