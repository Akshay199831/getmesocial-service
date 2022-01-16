package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.Model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
