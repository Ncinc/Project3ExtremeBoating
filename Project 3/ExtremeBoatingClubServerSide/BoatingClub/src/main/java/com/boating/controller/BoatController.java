package com.boating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boating.models.BoatModel;
import com.boating.service.BoatService;



@RestController
@RequestMapping("ExtremeBoatingClub/boats")
public class BoatController {
	@Autowired
	private BoatService boatService;
	
	@GetMapping()
	public List<BoatModel> findAll() {
		return boatService.findAll();
	}
	
	@GetMapping("boatname/{boatname}")
	public BoatModel findByUserName(@PathVariable String boatname) {
		return boatService.findByBoatName(boatname);
	}
	
	@GetMapping("boatid/{boatid}")
	public BoatModel findById(@PathVariable int boatid) {
		return boatService.findById(boatid);
	}
	
	
	
	@PostMapping()
	public BoatModel save (@RequestBody BoatModel b) {
		return boatService.save(b);
	}

}
