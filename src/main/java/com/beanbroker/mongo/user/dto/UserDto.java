package com.beanbroker.mongo.user.dto;

import com.beanbroker.mongo.common.type.UserType;
import com.beanbroker.mongo.user.collection.UserCollection;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDto {

  private UserType userType;
  private String userId;
  private String userName;
  private String email;
  private String address;
  private Integer age;

  public static UserDto toUserDto(UserCollection userCollection) {
    return UserDto.builder()
        .userId(userCollection.getUserId())
        .userName(userCollection.getUserName())
        .email(userCollection.getEmail())
        .address(userCollection.getAddress())
        .age(userCollection.getAge())
        .build();
  }
}
