package com.courzelo.app.auth.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.app.auth.entity.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {

	Role findByName(String name);
}
