package com.courzelo.courzelo_core.CourzeloCore.auth.entity;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.courzelo.courzelo_core.CourzeloCore.auth.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

public class Business {
  
  private String idBusiness;
	@NotBlank
	@Pattern(regexp="^[A-Za-z][A-Za-z0-9]+$",message="displayName must not begin with a number nor contain special caracters") 
  @Size(min = 3, max = 20)
	@NotEmpty
  private String companyName;
  //private String email;
  //private String password;
  
  //private boolean active;
  
 // private boolean enabled;
	@NotEmpty
  private String website;
	@NotEmpty
  private String nbEmployee;
	@NotEmpty
  private String firstName;
	@NotEmpty
  private String lastName;

	@NotEmpty
  private String recrutementRole;
  
	@NotEmpty
  private String phone;
  
	@NotEmpty
  private String industry;
  
	@NotEmpty
  private String country;
  
	@NotEmpty
  private String address;
  
	@NotEmpty
  private String logo;
	
  private boolean verified;
  

	@NotEmpty
  private String description;


  
  private Date creationDate;


	


	 @OneToOne
	    @JoinColumn(name = "user_id")
	private User user;









	public Business() {
		super();
	}









	public Business(String idBusiness,
			@NotBlank @Pattern(regexp = "^[A-Za-z][A-Za-z0-9]+$", message = "displayName must not begin with a number nor contain special caracters") @Size(min = 3, max = 20) @NotEmpty String companyName,
			@NotEmpty String website, @NotEmpty String nbEmployee, @NotEmpty String firstName,
			@NotEmpty String lastName, @NotEmpty String recrutementRole, @NotEmpty String phone,
			@NotEmpty String industry, @NotEmpty String country, @NotEmpty String address, @NotEmpty String logo,
			@NotEmpty String description, Date creationDate, User user) {
		super();
		this.idBusiness = idBusiness;
		this.companyName = companyName;
		this.website = website;
		this.nbEmployee = nbEmployee;
		this.firstName = firstName;
		this.lastName = lastName;
		this.recrutementRole = recrutementRole;
		this.phone = phone;
		this.industry = industry;
		this.country = country;
		this.address = address;
		this.logo = logo;
		this.description = description;
		this.creationDate = creationDate;
		this.user = user;
	}
	 
	 
	}

  

