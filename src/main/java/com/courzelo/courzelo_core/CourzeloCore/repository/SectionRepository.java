package com.courzelo.courzelo_core.CourzeloCore.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Section;






@Repository
public interface SectionRepository extends MongoRepository<Section, Integer> {
	
	public List<Section> findByIdformation(long idFormation);
	public Section findByIdSection(long idSection);
	
}
