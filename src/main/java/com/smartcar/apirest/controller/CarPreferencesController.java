package com.smartcar.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartcar.apirest.model.CarPreference;
import com.smartcar.apirest.repository.CarPreferenceRepository;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CarPreferencesController {
	
	@Autowired
	CarPreferenceRepository carPreferenceRepository;
	
	@GetMapping("/carpreference/findbyusername/{username}")
	public CarPreference findCarPreferenceByUsername(@PathVariable(value="username") String username) {
		return carPreferenceRepository.findByUsername(username);
	}
	
	@PostMapping("/carpreference/save")
	public CarPreference saveCarPreference(@RequestBody CarPreference carPreference) {
		return carPreferenceRepository.save(carPreference);
	}
	
	@GetMapping("carpreference/getall")
	public List<CarPreference> getAllCarPreferences(){
		return carPreferenceRepository.findAll();
	}

}
