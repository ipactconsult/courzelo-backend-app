package com.courzelo.courzelo_core.CourzeloCore.iserviceRest;

import java.util.List;

import com.courzelo.courzelo_core.CourzeloCore.dto.*;
import com.courzelo.courzelo_core.CourzeloCore.entity.*;



public interface IServiceSection {
	public SectionDTO addSection(SectionDTO f,long idFormation);
	
	public List<SectionDTO>getList();
	public List<SectionDTO>getSectionByIdFormation(long id);
	public SectionDTO getSectionById(long idSection); 
	public SectionDTO updateSection(long idSection ,SectionDTO requestSection); 
	
	public void deleteSection(long idSection); 

}
