package com.beanbroker.mongo.user.repositoy;

import com.beanbroker.mongo.user.collection.QUserCollection;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.support.QuerydslRepositorySupport;

public class UserRepositoryImpl extends QuerydslRepositorySupport implements UserRepositoryWrapper {

  private static final QUserCollection collection = QUserCollection.userCollection;

  public UserRepositoryImpl(MongoOperations operations) {
    super(operations);
  }


}
