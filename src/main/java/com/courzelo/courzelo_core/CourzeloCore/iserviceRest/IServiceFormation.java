package com.courzelo.courzelo_core.CourzeloCore.iserviceRest;

import java.util.List;

import com.courzelo.courzelo_core.CourzeloCore.dto.*;
import com.courzelo.courzelo_core.CourzeloCore.entity.*;









public interface IServiceFormation {
	public FormationDTO addformation(FormationDTO f,Long idUserr );
	public List<FormationDTO>getList();
	public List<FormationDTO>getFormtionByIdCreator(Long id);
	public List<FormationDTO>getFormtionByTest(Boolean test,Long id);
	public List<Formation> getFormationByIdStudent(Long id);
	public FormationDTO getFormationById(long idFormation); 
	public FormationDTO updateFormation(long idFormation , FormationDTO requestFormation); 
	public void deleteFormation(long idFormation); 
	public FormationDTO addQuiz(long id,String idQuiz);
	public List<InscriptionappDTO> getStats(Long id);
	public List<FormationTeacherDTO>getFormtionByIdInstructor(Long id);
	public List<FormationStudentsStatsDto> getStatsFormationStudents(Long idFormation);


}
