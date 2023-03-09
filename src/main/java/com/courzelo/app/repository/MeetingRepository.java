package com.courzelo.app.repository;

import java.util.List;

import com.courzelo.app.entity.Meeting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MeetingRepository extends MongoRepository<Meeting, Integer> {
	public List<Meeting> findAllByIdFormation(long idFormation);
	public List<Meeting> findAllByIdInstructor(long idInstructor);


}
