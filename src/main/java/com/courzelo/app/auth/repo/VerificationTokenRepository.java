package com.courzelo.app.auth.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.courzelo.app.auth.entity.VerificationToken;

public interface VerificationTokenRepository extends MongoRepository<VerificationToken, Long>{
	
	VerificationToken findByToken(String token);

}
