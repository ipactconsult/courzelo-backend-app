package com.courzelo.courzelo_core.CourzeloCore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.dto.*;
import com.courzelo.courzelo_core.CourzeloCore.entity.*;


@Repository
public interface ChatRepository extends MongoRepository<Chat, Integer> {

}
