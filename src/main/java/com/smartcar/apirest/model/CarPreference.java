package com.smartcar.apirest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarPreference implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	public String username;
	public int steeringWheelHeight;
	public int seatTilt;
	
	public long getId() {
		return id;
	}
	 
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getSteeringWheelHeight() {
		return steeringWheelHeight;
	}
	
	public void setSteeringWheelHeight(int steeringWheelHeight) {
		this.steeringWheelHeight = steeringWheelHeight;
	}
	
	public int getSeatTilt() {
		return seatTilt;
	}
	
	public void setSeatTilt(int seatTilt) {
		this.seatTilt = seatTilt;
	}
	
	public String toString() {
		return "Username: " + username + " - SteeringWheelHeight: " +
				steeringWheelHeight + "cm - SeatTilt: " + seatTilt+"º";
	}
	
}
