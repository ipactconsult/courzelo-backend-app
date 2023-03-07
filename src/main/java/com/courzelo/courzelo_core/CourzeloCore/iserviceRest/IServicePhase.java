package com.courzelo.courzelo_core.CourzeloCore.iserviceRest;

import java.util.List;

import com.courzelo.courzelo_core.CourzeloCore.dto.*;
import com.courzelo.courzelo_core.CourzeloCore.entity.*;




public interface IServicePhase {
	public PhaseDTO addPhase(PhaseDTO f,long idSection);
	
	public List<PhaseDTO>getList();
	public List<PhaseDTO>getPhaseByIdSection(long id);
	public PhaseDTO getPhaseById(long idPhase); 
	public PhaseDTO updatePhase(long idPhase ,PhaseDTO requestPhase); 
	
	public void deletePhase(long idPhase); 

}
