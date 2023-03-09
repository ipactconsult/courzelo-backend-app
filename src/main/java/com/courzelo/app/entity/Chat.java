package com.courzelo.app.entity;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.courzelo.app.auth.entity.User;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "chat")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Chat {
	
	@Transient
	public static final String SEQUENCE_NAME = "database_sequences";
	
	@Id
	private String chatId;
	@Field("userId")
	private User userId;
	@Field("message")
	private String message;
	@Field("date")
	private Date sendDate;
	

}
