package com.beanbroker.mongo.common;

import com.beanbroker.mongo.common.exception.CommonException;
import com.beanbroker.mongo.common.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@Slf4j
public class CommonExceptionHandler {

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public final ErrorResponse handleRuntime(HttpServletRequest req, Exception e) {

    log.error(e.getMessage(), e);
    return new ErrorResponse("서버 관리자에게 문의바람");
  }

  @ExceptionHandler(CommonException.class)
  public final ResponseEntity<ErrorResponse> handleCommonException(
      HttpServletRequest req, CommonException e) {

    return new ResponseEntity<>(
        new ErrorResponse(e.getErrReason()), HttpStatus.valueOf(e.getStatusCode()));
  }
}
