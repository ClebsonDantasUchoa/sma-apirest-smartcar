package com.smartcar.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.smartcar.apirest.repository.HistoricRepository;
import com.smartcar.apirest.model.Historic;

@RestController
@RequestMapping(value = "/api")
public class HistoricController {
	
	@Autowired
	private HistoricRepository historicRepository;

	
	@GetMapping("/historic/findbyusername/{username}")
	public List<Historic> getHistoricByUsername(@PathVariable(value="username") String username){
		return historicRepository.findByUsername(username);
	}
	
	@GetMapping("/historic/getall")
	public List<Historic> getAll(){
		return historicRepository.findAll();
	}

}
