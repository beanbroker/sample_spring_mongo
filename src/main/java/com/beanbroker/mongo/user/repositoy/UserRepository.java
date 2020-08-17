package com.beanbroker.mongo.user.repositoy;

import com.beanbroker.mongo.user.collection.UserCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface UserRepository
    extends MongoRepository<UserCollection, String>,
        QuerydslPredicateExecutor<UserCollection>,
        UserRepositoryWrapper {

  Optional<UserCollection> findByUserId(String userId);
}
