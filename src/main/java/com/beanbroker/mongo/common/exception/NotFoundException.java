package com.beanbroker.mongo.common.exception;

public class NotFoundException extends CommonException {
    public NotFoundException(String errReason) {
        super(404, errReason);
    }
}
