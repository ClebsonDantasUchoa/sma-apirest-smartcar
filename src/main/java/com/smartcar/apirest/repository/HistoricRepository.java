package com.smartcar.apirest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.smartcar.apirest.model.Historic;

@Repository
public interface HistoricRepository extends JpaRepository<Historic, Long>{
	
	public List<Historic> findByUsername(String username);
	
}
