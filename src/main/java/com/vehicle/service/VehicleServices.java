package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.entity.Vehicle;

@Service
public interface VehicleServices {

	List<Vehicle> getAllVehicles();

	Vehicle createnewVehicle(Vehicle vehicle);

}
 