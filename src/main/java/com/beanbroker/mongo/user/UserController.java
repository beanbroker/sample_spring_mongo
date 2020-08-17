package com.beanbroker.mongo.user;

import com.beanbroker.mongo.user.dto.UserDto;
import com.beanbroker.mongo.user.dto.UserSignUpRequest;
import com.beanbroker.mongo.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public void createUser(@RequestBody UserSignUpRequest userSignUpRequest) {

    userService.createUser(userSignUpRequest);
  }

  @GetMapping
  public UserDto user(@RequestParam("userId") String userId) {



    return userService.getUserData(userId);
  }

  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("/{userId}")
  public void updateUser(@PathVariable("userId") String userId) {

    userService.deleteUser(userId);
  }
}
