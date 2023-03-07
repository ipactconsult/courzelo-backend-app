package com.courzelo.courzelo_core.CourzeloCore.entity;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import com.courzelo.courzelo_core.CourzeloCore.auth.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Document(collection="CandidateApp")
@Getter
@Setter
@AllArgsConstructor
public class CandidateApp {
	    
	    @Id
	    @Field(targetType = FieldType.OBJECT_ID,value = "idCandidateApp")
	    private String idCandidateApp;

	    @Field(value = "applicationDate")
	    private Date applicationDate;
	    
	    @Field(value = "user")
	    private User user;
	    
	    @Field(value = "Job")
	    private JobOffers job;
	    
	    @Field(value = "cv")
	    private String cv;
	    
	    @Field(value = "idTest") 
	    private List<String> idTest;
	    
	    @Field(value = "candidateState") 
	    private List<State> candidateState;

		
		public CandidateApp() {}
		
	    
	    
}
