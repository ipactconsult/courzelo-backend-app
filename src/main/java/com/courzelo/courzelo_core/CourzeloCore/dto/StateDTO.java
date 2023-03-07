package com.courzelo.courzelo_core.CourzeloCore.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class StateDTO {

	  private long idCandidateState; 
	  private Date stateDate;
	  private String label;
	  private int step;
	  private int score;
	  private String idPrehiringTest;
	  private String idTest;
	  private String linkMeet;
	  private Date interviewDate;
	  private String offerDoc;
	  
	  private boolean testState;
	  public StateDTO() {}
	  
	  
}
