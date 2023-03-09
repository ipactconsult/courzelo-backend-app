package com.courzelo.app.repository;

import java.util.List;

import com.courzelo.app.entity.Phase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PhaseRepository extends MongoRepository<Phase, Integer> {
	
	public List<Phase> findByIdsection(long idSection);
	public Phase findByIdPhase(long idPhase);
	
}
