package com.exception.ExceptionHandling.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(DuplicateHeader.class)
    public ResponseEntity<ErrorResponse> duplicateRequestException(DuplicateHeader ex) {
		ErrorResponse error = new ErrorResponse();
		error.setStatuscode(400);
		error.setMessage(ex.getMessage());
		error.setStacktrace(ex.getStackTrace()[0].toString());
		error.setTime(LocalDateTime.now());
		return new  ResponseEntity<ErrorResponse>(error,HttpStatus.BAD_REQUEST);
	}
	
}
