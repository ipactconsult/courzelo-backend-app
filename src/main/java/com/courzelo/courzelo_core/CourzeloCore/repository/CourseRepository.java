package com.courzelo.courzelo_core.CourzeloCore.repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {

}
