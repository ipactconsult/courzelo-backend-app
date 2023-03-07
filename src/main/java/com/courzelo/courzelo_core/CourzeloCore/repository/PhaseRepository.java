package com.courzelo.courzelo_core.CourzeloCore.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Phase;







@Repository
public interface PhaseRepository extends MongoRepository<Phase, Integer> {
	
	public List<Phase> findByIdsection(long idSection);
	public Phase findByIdPhase(long idPhase);
	
}
