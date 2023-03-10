package com.courzelo.app.iserviceRest;

import java.util.List;

import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;
import com.courzelo.app.dto.SectionDTO;


public interface IServiceSection {
	public SectionDTO addSection(SectionDTO f, long idFormation);
	
	public List<SectionDTO>getList();
	public List<SectionDTO>getSectionByIdFormation(long id);
	public SectionDTO getSectionById(long idSection); 
	public SectionDTO updateSection(long idSection ,SectionDTO requestSection); 
	
	public void deleteSection(long idSection); 

}
