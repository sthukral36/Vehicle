package com.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vehicle.entity.Vehicle;
import com.vehicle.repository.VehicleRepo;

@Component
public class VehicleServiceimpl implements VehicleServices {

	@Autowired
	private VehicleRepo rep;

	@Override
	public List<Vehicle> getAllVehicles() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}

	@Override
	public Vehicle createnewVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return rep.save(vehicle);
	}

}
