package com.courzelo.app.repository;

import com.courzelo.app.entity.Chat;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;


@Repository
public interface ChatRepository extends MongoRepository<Chat, Integer> {

}
