package com.beanbroker.mongo.user.repositoy;

import com.beanbroker.mongo.user.collection.QUserCollection;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import org.springframework.util.ObjectUtils;

public class UserPredictor {

  private static final QUserCollection userCollection = QUserCollection.userCollection;
  private BooleanBuilder builder = new BooleanBuilder();

  public UserPredictor userId(String userId) {

    if (!ObjectUtils.isEmpty(userId)) {

      builder.and(userCollection.userId.eq(userId));
    }
    return this;
  }

  public UserPredictor email(String email) {

    if (!ObjectUtils.isEmpty(email)) {

      builder.and(userCollection.email.eq(email));
    }
    return this;
  }

  public UserPredictor userName(String userName) {

    if (!ObjectUtils.isEmpty(userName)) {

      builder.and(userCollection.userName.eq(userName));
    }
    return this;
  }

  public Predicate values() {
    return builder.getValue();
  }
}
