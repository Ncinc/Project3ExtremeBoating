package com.boating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boating.models.BoatModel;
import com.boating.repo.BoatRepo;

@Service
public class BoatService {

	@Autowired
	private BoatRepo boatRepo;
	
	public List<BoatModel> findAll() {
		return boatRepo.findAll();
	}
	
	public BoatModel findByBoatName(String boatname) {

		List<BoatModel> boatList = boatRepo.findUsingNameHQL(boatname);
		if(boatList.size() == 0 )
		{
			return null;
		}
		return boatList.get(0);
	}
	
	public BoatModel findById(int boatid) {

		List<BoatModel> boatidList = boatRepo.findUsingIdHQL(boatid);
		if(boatidList.size() == 0 )
		{
			return null;
		}
		return boatidList.get(0);
	}
	
	
	public BoatModel save (BoatModel b) {
		return boatRepo.save(b);
	}

}
