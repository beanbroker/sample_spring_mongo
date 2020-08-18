package com.beanbroker.mongo.user.collection;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("userAuditor")
public class UserAuditor implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {

    return Optional.of("beanbroker");
  }
}
