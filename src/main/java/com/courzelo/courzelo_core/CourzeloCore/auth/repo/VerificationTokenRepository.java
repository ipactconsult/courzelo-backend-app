package com.courzelo.courzelo_core.CourzeloCore.auth.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.courzelo.courzelo_core.CourzeloCore.auth.entity.VerificationToken;

public interface VerificationTokenRepository extends MongoRepository<VerificationToken, Long>{
	
	VerificationToken findByToken(String token);

}
