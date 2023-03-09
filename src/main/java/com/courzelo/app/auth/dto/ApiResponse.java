package com.courzelo.app.auth.dto;

import lombok.Value;

@Value
public class ApiResponse {
	private Boolean success;
	private String message;
}