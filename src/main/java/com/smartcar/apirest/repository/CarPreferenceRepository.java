package com.smartcar.apirest.repository;
import com.smartcar.apirest.model.CarPreference;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarPreferenceRepository extends JpaRepository<CarPreference, Long>{
	
	public CarPreference findByUsername(String username);

}
