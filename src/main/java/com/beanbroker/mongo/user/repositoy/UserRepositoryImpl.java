package com.beanbroker.mongo.user.repositoy;

import com.beanbroker.mongo.user.collection.QUserCollection;
import com.beanbroker.mongo.user.collection.UserCollection;
import com.querydsl.core.types.Predicate;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.support.QuerydslRepositorySupport;

public class UserRepositoryImpl extends QuerydslRepositorySupport implements UserRepositoryWrapper {

  private static final QUserCollection collection = QUserCollection.userCollection;

  public UserRepositoryImpl(MongoOperations operations) {
    super(operations);
  }

  @Override
  public UserCollection findByUserName(String userName) {

    return from(collection).where(collection.userName.eq(userName)).fetchOne();
  }



  //test of test

  @Override
  public UserCollection findByUserPredictor(Predicate predicate) {

    return from(collection).where(predicate).fetchOne();
  }
}
