package com.beanbroker.mongo.config; // package com.h4d1.lifeland.health.config.activemq;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.beanbroker.mongo.user.repositoy")
@EnableMongoAuditing
public class MongoAuditConfig {}
