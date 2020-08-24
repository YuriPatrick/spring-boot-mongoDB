package com.psm.projectSpringMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.psm.projectSpringMongoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
