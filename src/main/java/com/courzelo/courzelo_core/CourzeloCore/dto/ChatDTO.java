package com.courzelo.courzelo_core.CourzeloCore.dto;

import java.util.Date;

import com.courzelo.courzelo_core.CourzeloCore.auth.entity.User;

import lombok.Data;

@Data
public class ChatDTO {
	
	private String chatId;

	private User userId;

	private String message;

	private Date sendDate;
}
