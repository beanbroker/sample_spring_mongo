package com.beanbroker.mongo.user.dto;

import com.beanbroker.mongo.common.type.UserType;
import lombok.Getter;

@Getter
public class UserSignUpRequest {

  private UserType userType;
  private String userId;
  private String userName;
  private String email;
  private String address;
  private Integer age;
}
