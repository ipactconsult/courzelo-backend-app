package com.courzelo.app.auth.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Getter;
import lombok.Setter;

/**
 * The persistent class for the user database table.
 * 
 */
@Document
@Getter
@Setter
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 65981149772133526L;
	
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";

	
	@Column(name = "USER_ID")
	@Id
	private Long id;

	@Column(name = "PROVIDER_USER_ID")
	private String providerUserId;

	private String email;
	private String github;
	private String instagram;
	private String facebook;

	@Column(name = "enabled", columnDefinition = "BIT", length = 1)
	private boolean enabled;

	@Column(name = "DISPLAY_NAME")
	private String displayName;

	private  Set<Long> following = ConcurrentHashMap.newKeySet(); //subscribedtoUsers
	private  Set<Long> followers= ConcurrentHashMap.newKeySet();

	@Column(name = "created_date", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	protected Date modifiedDate;

	private String password;

	private String provider;
	
	private String resetPasswordToken;

	// bi-directional many-to-many association to Role
	@DBRef
	  private Set<Role> roles = new HashSet<>();

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Business business;
   
	public User(Long id, String providerUserId, String email, boolean enabled, String displayName, Date createdDate,
			Date modifiedDate, String password, String provider, Set<Role> roles,Set<Long> followers,Set<Long> following) {
		super();
		this.id = id;
		this.providerUserId = providerUserId;
		this.email = email;
		this.enabled = enabled;
		this.displayName = displayName;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.password = password;
		this.provider = provider;
		this.roles = roles;
		this.following=following;
		this.followers=followers;
	}
	

	public User() {
		super();
	}

	public void addToFollowingList(Long userId) {
		following.add(userId);
	}
	public void addToFollowersList(Long userId) {
		followers.add(userId);
	}
	public void removefromfollowedList(Long userId) {
		following.remove(userId);
	}
	public void removeFromFollowersList(Long userId) {
		followers.remove(userId);
	}


	public User(Long id, String providerUserId, String email, String github, String instagram, String facebook,
			boolean enabled, String displayName, Set<Long> following, Set<Long> followers, Date createdDate,
			Date modifiedDate, String password, String provider, String resetPasswordToken, Set<Role> roles,
			Business business) {
		super();
		this.id = id;
		this.providerUserId = providerUserId;
		this.email = email;
		this.github = github;
		this.instagram = instagram;
		this.facebook = facebook;
		this.enabled = enabled;
		this.displayName = displayName;
		this.following = following;
		this.followers = followers;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.password = password;
		this.provider = provider;
		this.resetPasswordToken = resetPasswordToken;
		this.roles = roles;
		this.business = business;
	}

	
	
}
