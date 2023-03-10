package com.courzelo.app.auth.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.app.auth.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

	User findByEmail(String email);

	boolean existsByEmail(String email);

	User findByResetPasswordToken(String token);

	List<User> findByDisplayName(String displayName);

	User findUserById(Long  id);
	User findOnByDisplayName(String displayName);

	  
}
