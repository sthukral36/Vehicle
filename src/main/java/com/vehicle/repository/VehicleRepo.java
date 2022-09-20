package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.entity.Vehicle;



@Repository
public interface VehicleRepo extends JpaRepository<Vehicle,Integer>{

}
 