package com.courzelo.app.repository;

import com.courzelo.app.entity.MyLearning;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.courzelo.app.auth.entity.User;

public interface MyLearningRepository extends MongoRepository<MyLearning, Long>{
	
	MyLearning findMyLearningByUser(User user);
	
	boolean existsByUser(User user);
	
	MyLearning findMyLearningByUserId(long id);

}
