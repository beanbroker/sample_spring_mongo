package com.beanbroker.mongo.user.repositoy;

import com.beanbroker.mongo.user.collection.UserCollection;
import com.querydsl.core.types.Predicate;

public interface UserRepositoryWrapper {

    UserCollection findByUserName(String userName);
    UserCollection findByUserPredictor(Predicate predicate);
}
