package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
