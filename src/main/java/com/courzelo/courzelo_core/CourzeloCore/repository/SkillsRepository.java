package com.courzelo.courzelo_core.CourzeloCore.repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Skills;
import com.courzelo.courzelo_core.CourzeloCore.entity.Type;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends MongoRepository<Skills, String> {

    @Query("{iduser: ?0, type: ?1}")
    Skills findskillsByUser(String iduser, Type type); //trouver sol pour type

}
