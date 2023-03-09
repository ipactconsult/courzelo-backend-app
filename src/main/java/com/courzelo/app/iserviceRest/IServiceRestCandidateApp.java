package com.courzelo.app.iserviceRest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;

import com.courzelo.app.dto.CandidateAppDTO;
import com.courzelo.app.dto.StateDTO;
import com.courzelo.app.entity.LoadFile;
import org.springframework.web.multipart.MultipartFile;

import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;



public interface IServiceRestCandidateApp {
	
	public List<CandidateAppDTO> getAllapplications();
	public CandidateAppDTO getCandidateById(String idCandidateApp );
	public List<CandidateAppDTO> getAppByBusiness(String idBusiness);
	public List<CandidateAppDTO> getCandidateByJob(String idJob );
	public List<CandidateAppDTO> getCandidateByUser(Long userId);
	public StateDTO getCurrentState(String idCandidateApp );
	public boolean ExistApp(String idJob,Long id) ;
	public CandidateAppDTO addApp(CandidateAppDTO candidateApp,String idJob,Long id) throws IOException;
	public CandidateAppDTO updateApp(String idCandidateApp,CandidateAppDTO candidateApp);
	public CandidateAppDTO addState(String idCandidateApp,StateDTO candidateState);
	public void deleteApp(String idCandidateApp);
	public void sendMail(String email,String content) throws MessagingException, UnsupportedEncodingException;
	public CandidateAppDTO addCv(String idCandidateApp,MultipartFile cv) throws IOException ;
	public CandidateAppDTO saveOffer(String idCandidateApp,long idCandidateState,MultipartFile offerDoc) throws IOException ;
	public LoadFile getPdf(String pdf) throws IOException ;
	

}
