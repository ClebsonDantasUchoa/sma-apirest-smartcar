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
import com.smartcar.apirest.service.HistoricService;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CarPreferencesController {
	
	@Autowired
	CarPreferenceRepository carPreferenceRepository;
	
	@Autowired
	HistoricService historicService;
	
	@GetMapping("/carpreference/findbyusername/{username}")
	public CarPreference findCarPreferenceByUsername(@PathVariable(value="username") String username) {
		return carPreferenceRepository.findByUsername(username);
	}
	
	@PostMapping("/carpreference/save")
	public CarPreference saveCarPreference(@RequestBody CarPreference carPreference) {
		CarPreference carPreferenceSaved = carPreferenceRepository.findByUsername(carPreference.getUsername());
		if(carPreferenceSaved != null) {
			carPreferenceSaved.replaceFields(carPreference);
			carPreference = carPreferenceSaved;
		}
		carPreference = carPreferenceRepository.save(carPreference);
		historicService.saveCarPreferenceInHistoric(carPreference);
		return carPreferenceSaved;
	}
	
	@GetMapping("carpreference/getall")
	public List<CarPreference> getAllCarPreferences(){
		return carPreferenceRepository.findAll();
	}

}
