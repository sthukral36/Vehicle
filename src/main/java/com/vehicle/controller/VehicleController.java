package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.Vehicle;
import com.vehicle.service.VehicleServiceimpl;

@RestController

@CrossOrigin(origins = "http://localhost:4200/")

public class VehicleController  {
	
	@Autowired
	VehicleServiceimpl ser;
	
	
	 
	
	@GetMapping("/details")
	public List<Vehicle> getAllVehicles() { 
		return ser.getAllVehicles();
		
	}
	
	@PostMapping("/enter/details")
	public Vehicle createnewVehicle(@RequestBody Vehicle vehicle) {
		return ser.createnewVehicle(vehicle);
		
	}	

}
