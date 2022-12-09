package com.example.demo.infraestructure.configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.infraestructure.repository.mongodb.SpringDataMongoOrderRepository;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoOrderRepository.class)
public class MongoDBConfiguration {
}
