package com.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	public String registrationNumber;
    public String name; 
    public String state;  
    public String  city;
    public String vehicleType;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Vehicle(int id, String registrationNumber, String name, String state, String city, String vehicleType) {
		super();
		Id = id;
		this.registrationNumber = registrationNumber;
		this.name = name;
		this.state = state;
		this.city = city;
		this.vehicleType = vehicleType;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [Id=" + Id + ", registrationNumber=" + registrationNumber + ", name=" + name + ", state="
				+ state + ", city=" + city + ", vehicleType=" + vehicleType + "]";
	}
    
    
    
}