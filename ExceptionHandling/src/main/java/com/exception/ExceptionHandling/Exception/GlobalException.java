package com.exception.ExceptionHandling.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(DuplicateHeader.class)
    public ResponseEntity<String> duplicateRequestException(DuplicateHeader ex) {
		return new  ResponseEntity<String>(ex.getMessage(),HttpStatus.FOUND);
	}
	
}
