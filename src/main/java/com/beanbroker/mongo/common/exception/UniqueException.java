package com.beanbroker.mongo.common.exception;

public class UniqueException extends CommonException {
  public UniqueException(String errReason) {
    super(409, errReason);
  }
}
