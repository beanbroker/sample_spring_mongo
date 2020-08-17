package com.beanbroker.mongo.user.collection;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserCollection is a Querydsl query type for UserCollection
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserCollection extends EntityPathBase<UserCollection> {

    private static final long serialVersionUID = 462837480L;

    public static final QUserCollection userCollection = new QUserCollection("userCollection");

    public final StringPath address = createString("address");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final StringPath createBy = createString("createBy");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath email = createString("email");

    public final StringPath id = createString("id");

    public final NumberPath<Integer> isDeleted = createNumber("isDeleted", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public final StringPath updatedBy = createString("updatedBy");

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public QUserCollection(String variable) {
        super(UserCollection.class, forVariable(variable));
    }

    public QUserCollection(Path<? extends UserCollection> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserCollection(PathMetadata metadata) {
        super(UserCollection.class, metadata);
    }

}

