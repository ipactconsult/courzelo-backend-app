package com.courzelo.app.serviceRest;


import java.util.ArrayList;
import java.util.List;

import com.courzelo.app.iserviceRest.IServiceInscription;
import com.courzelo.app.dto.FormationDTO;
import com.courzelo.app.repository.FormationRepository;
import com.courzelo.app.repository.InscriptionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;
import com.courzelo.app.auth.entity.User;

import com.courzelo.app.auth.service.SequenceGeneratorService;
import com.courzelo.app.dto.InscriptionDTO;
import com.courzelo.app.entity.Formation;
import com.courzelo.app.entity.Inscription;
import com.courzelo.app.iserviceRest.*;
import com.courzelo.app.repository.*;

@Service
public class InscriptionBusinesses implements IServiceInscription {
	   @Autowired
       InscriptionRepository inscriptionRepository;
	
	   @Autowired
       private ModelMapper mapper;
       @Autowired
       private  SequenceGeneratorService sequenceGeneratorService;
       @Autowired
       private FormationBusinesses formationService;
       @Autowired
       FormationRepository formationRepository;
	@Override
	public InscriptionDTO addInscription(InscriptionDTO f, Long idEtudiant, Long idFormation) {
		Inscription inscription = mapper.map(f,Inscription.class);
		  inscription.setId(sequenceGeneratorService.generateSequence(Formation.SEQUENCE_NAME));
		  inscription.setIdEtudiant(idEtudiant);
		  inscription.setIdFormation(idFormation);
	      Inscription newInscri =inscriptionRepository.save(inscription);
	      
	       return mapper.map(newInscri,InscriptionDTO.class);	
	}
	
	@Override
	public List<User> getListInscription(Long id) {
		List<User> users=new  ArrayList<User>();
		List<Inscription> inscriptions=inscriptionRepository.findByIdFormation(id);
                for(Inscription i:inscriptions) {
                	User user=formationService.getUserByRestTemplate(i.getIdEtudiant());
               System.out.println("user" +user.getDisplayName() );
                	users.add(user);
                }
		return users;
	}
	


	@Override
	public List<FormationDTO> getAllFormationsByUser(Long idUser) {
		
		List<FormationDTO> formationDtoList = new ArrayList<FormationDTO>();
		List<Inscription> inscriptions=inscriptionRepository.findAllByIdEtudiant(idUser);
		inscriptions.stream().forEach(elem ->formationDtoList.add(mapper.map(formationRepository.findByIdFormation(elem.getIdFormation()), FormationDTO.class)) );	


		return formationDtoList;
	}

	@Override
	public boolean checkFormationByUser(long formationId, Long idUser) {
		
	
		return inscriptionRepository.existsByIdFormationAndIdEtudiant(formationId, idUser);
	
	}

	

	
	

	



}
