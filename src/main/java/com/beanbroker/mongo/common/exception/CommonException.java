package com.beanbroker.mongo.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonException extends RuntimeException{

    public CommonException(int statusCode, String errReason){
        this.statusCode = statusCode;
        this.errReason = errReason;
    }
    private int statusCode;
    private String errReason;
}
