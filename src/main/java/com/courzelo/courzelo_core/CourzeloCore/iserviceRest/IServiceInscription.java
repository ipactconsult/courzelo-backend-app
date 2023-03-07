package com.courzelo.courzelo_core.CourzeloCore.iserviceRest;

import java.util.List;


import com.courzelo.courzelo_core.CourzeloCore.auth.entity.User;
import com.courzelo.courzelo_core.CourzeloCore.dto.FormationDTO;
import com.courzelo.courzelo_core.CourzeloCore.dto.InscriptionDTO;




public interface IServiceInscription {
public InscriptionDTO addInscription(InscriptionDTO f,Long idEtudiant ,Long idFormation);	
 public List<User> getListInscription(Long id);
 public List<FormationDTO> getAllFormationsByUser(Long idUser);
 public boolean  checkFormationByUser(long formationId,Long idUser  );
 
 
 
}
