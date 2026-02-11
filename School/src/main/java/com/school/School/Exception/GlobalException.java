package com.school.School.Exception;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalException {

//	@ExceptionHandler(DuplicateRequestException.class)
//	public ResponseEntity<String> duplicateRequestException(DuplicateRequestException ex) {
//		return new  ResponseEntity<String>(ex.getMessage(),HttpStatus.FORBIDDEN);
//	}
//	
	@ExceptionHandler(DuplicateRequestException.class)
	public ResponseEntity<ErrorResponse> duplicateRequestException(DuplicateRequestException ex) {
		ErrorResponse re = new ErrorResponse();
		re.setStatuscode(123);
		re.setMessage(ex.getMessage());
		re.setTime(LocalDateTime.now());
		re.setTrace(ex.getStackTrace().toString());
//		Arrays.asList(ex.getStackTrace())
//		.stream().limit(1)
//		.map((i)-> (i.toString())).forEach((i)->{
//			re.setTrace(i);
//		});
		return new  ResponseEntity<ErrorResponse>(re,HttpStatus.FORBIDDEN);
	}
}
