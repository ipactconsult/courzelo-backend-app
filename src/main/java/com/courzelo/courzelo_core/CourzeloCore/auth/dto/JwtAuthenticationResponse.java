package com.courzelo.courzelo_core.CourzeloCore.auth.dto;

import lombok.Value;

@Value
public class JwtAuthenticationResponse {
	private String accessToken;
	private UserInfo user;
}