package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.model.Task;

public interface TaskRepository extends MongoRepository<Task, Integer> {

}
