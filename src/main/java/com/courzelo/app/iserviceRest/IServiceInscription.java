package com.courzelo.app.iserviceRest;

import java.util.List;


import com.courzelo.app.auth.entity.User;
import com.courzelo.app.dto.FormationDTO;
import com.courzelo.app.dto.InscriptionDTO;




public interface IServiceInscription {
public InscriptionDTO addInscription(InscriptionDTO f,Long idEtudiant ,Long idFormation);	
 public List<User> getListInscription(Long id);
 public List<FormationDTO> getAllFormationsByUser(Long idUser);
 public boolean  checkFormationByUser(long formationId,Long idUser  );
 
 
 
}
