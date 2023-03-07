package com.courzelo.courzelo_core.CourzeloCore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Like;

@Repository
public interface LikeRepository extends MongoRepository<Like, Long>{

}
