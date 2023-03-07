package com.courzelo.courzelo_core.CourzeloCore.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Inscription;



@Repository
public interface InscriptionRepository extends MongoRepository<Inscription, Integer> {

	public  List<com.courzelo.courzelo_core.CourzeloCore.entity.Inscription> findByIdEtudiant(long idStudent ) ;
	public  List<Inscription> findByIdFormation(long idStudent ) ;
	public List<Inscription> findAllByIdEtudiant(long idStudent);
	public boolean existsByIdFormationAndIdEtudiant( long idFormation , long idStudent);
	public int countByIdFormation(long idFormation);

	
	 

}
