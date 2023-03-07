package com.courzelo.courzelo_core.CourzeloCore.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.dto.*;
import com.courzelo.courzelo_core.CourzeloCore.entity.*;





@Repository
public interface FormationRepository extends MongoRepository<Formation, Integer> {
	//this repository contain all operations of mongodb
	public  Formation findByIdFormation(long idFormation);
	public List<Formation> findByIdUserr(Long idCreator);
	
	public List<Formation> findByTestAndIdUserr(Boolean test,Long id);
	
	

}
