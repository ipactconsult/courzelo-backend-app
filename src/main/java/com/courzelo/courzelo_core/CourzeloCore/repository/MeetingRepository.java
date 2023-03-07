package com.courzelo.courzelo_core.CourzeloCore.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Meeting;



@Repository
public interface MeetingRepository extends MongoRepository<Meeting, Integer> {
	public List<Meeting> findAllByIdFormation(long idFormation);
	public List<Meeting> findAllByIdInstructor(long idInstructor);


}
