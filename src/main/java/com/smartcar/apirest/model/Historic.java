package com.smartcar.apirest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Historic implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long historic_id;
	
	private Date date;
	
	private String username;
	
	private CarPreference carPreference;
	
	public Historic(CarPreference carPreference, Date date, String username) {
		this.date = date;
		this.carPreference = carPreference;
		this.username = username;
	}
	
	public Historic() {
		
	}
	
	public long getId() {
		return historic_id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public CarPreference getCarPreference() {
		return carPreference;
	}
	
	public void setCarPreference(CarPreference carPreference) {
		this.carPreference = carPreference;
	}
	
	public String getUsername() {
		return this.username;
	}

}
