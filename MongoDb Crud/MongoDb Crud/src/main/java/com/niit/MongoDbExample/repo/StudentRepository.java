package com.niit.MongoDbExample.repo;

import com.niit.MongoDbExample.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {
}
