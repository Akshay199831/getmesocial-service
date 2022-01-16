package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.Model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
