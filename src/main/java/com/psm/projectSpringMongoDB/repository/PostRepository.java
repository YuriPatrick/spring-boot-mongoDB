package com.psm.projectSpringMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.psm.projectSpringMongoDB.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
