package com.smartcar.apirest.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcar.apirest.model.CarPreference;
import com.smartcar.apirest.model.Historic;
import com.smartcar.apirest.repository.HistoricRepository;

@Service
public class HistoricService {
	
	@Autowired
	private HistoricRepository historicRepository;
	
	public void saveCarPreferenceInHistoric(CarPreference carPreference) {
		this.historicRepository.save(new Historic(carPreference, new Date(), carPreference.getUsername()));
	}

}
