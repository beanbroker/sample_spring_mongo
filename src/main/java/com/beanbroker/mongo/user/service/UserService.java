package com.beanbroker.mongo.user.service;

import com.beanbroker.mongo.common.exception.NotFoundException;
import com.beanbroker.mongo.common.exception.UniqueException;
import com.beanbroker.mongo.user.collection.UserCollection;
import com.beanbroker.mongo.user.dto.UserDto;
import com.beanbroker.mongo.user.dto.UserSignUpRequest;
import com.beanbroker.mongo.user.repositoy.UserPredictor;
import com.beanbroker.mongo.user.repositoy.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;
import java.util.UUID;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Transactional
  public void createUser(UserSignUpRequest req) {

    userRepository
        .findByUserId(req.getUserId())
        .ifPresent(
            user -> {
              throw new UniqueException("already user");
            });

    final String id = req.getUserType() + UUID.randomUUID().toString();
    UserCollection userCollection =
        UserCollection.builder()
            .id(id)
            .userId(req.getUserId())
            .userName(req.getUserName())
            .email(req.getEmail())
            .address(req.getAddress())
            .age(req.getAge())
            .build();

    userRepository.save(userCollection);
  }

  public UserDto getUserData(String userId) {

    UserCollection userCollection =
        userRepository
            .findByUserId(userId)
            .orElseThrow(() -> new NotFoundException("user data is not found"));

    return UserDto.toUserDto(userCollection);
  }

  @Transactional
  public void deleteUser(String userId) {
    UserCollection userCollection =
        userRepository
            .findByUserId(userId)
            .orElseThrow(() -> new NotFoundException("user data is not found"));

    userCollection.setIsDeleted(1);
    userRepository.save(userCollection);
  }

  public UserDto findByUserName(String userName) {

    UserCollection userCollection = userRepository.findByUserName(userName);

    return UserDto.toUserDto(userCollection);
  }

  public UserDto findByUserPredictor(UserPredictor predictor) {

    UserCollection userCollection = userRepository.findByUserPredictor(predictor.values());
    if (Objects.isNull(userCollection)) {
      throw new NotFoundException("user data is not found");
    }
    return UserDto.toUserDto(userCollection);
  }
}
