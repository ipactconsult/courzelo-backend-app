package com.courzelo.courzelo_core.CourzeloCore.dto;

import java.util.Date;
import java.util.List;


import com.courzelo.courzelo_core.CourzeloCore.auth.entity.User;
import com.courzelo.courzelo_core.CourzeloCore.entity.JobOffers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CandidateAppDTO {
	
	private String idCandidateApp;
    private Date applicationDate;
    private User user;
    private JobOffers job;
    private String cv;
    private List<String> idTest;
    private List<StateDTO> candidateState;
	public CandidateAppDTO() {}
	
	

    
}
