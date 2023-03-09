package com.courzelo.app.auth.dto;

import java.util.List;
import java.util.Set;

import lombok.Value;

@Value
public class UserInfo {
	private String id, displayName, email;
	private List<String> roles;
	private Set<Long> following;
	private Set<Long> followers;
}
