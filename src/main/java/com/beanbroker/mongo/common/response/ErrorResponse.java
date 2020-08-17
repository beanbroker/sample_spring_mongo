package com.beanbroker.mongo.common.response;

public class ErrorResponse {

  public ErrorResponse(String errorReason) {
    this.errorReason = errorReason;
  }

  private String errorReason;
}
