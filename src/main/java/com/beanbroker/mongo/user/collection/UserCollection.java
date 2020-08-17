package com.beanbroker.mongo.user.collection;

import com.querydsl.core.annotations.QueryEntity;
import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@QueryEntity
@Document(collection = "user")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCollection {

  @Id @Field private String id;

  @Field private String userId;

  @Field private String userName;

  @Field private String email;

  @Field private String address;

  @Field private Integer age;

  @Field @CreatedBy private String createBy;
  @Field @CreatedDate private LocalDateTime createdAt;
  @Field @LastModifiedBy private String updatedBy;
  @Field @LastModifiedDate private LocalDateTime updatedAt;

  @Field("isDeleted")
  private int isDeleted;
}
