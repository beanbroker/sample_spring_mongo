package com.beanbroker.mongo.common.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

  public ErrorResponse(String errorReason) {
    this.errorReason = errorReason;
  }

  private String errorReason;
}
