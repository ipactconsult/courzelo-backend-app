package com.courzelo.courzelo_core.CourzeloCore.auth.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.auth.entity.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {

	Role findByName(String name);
}
