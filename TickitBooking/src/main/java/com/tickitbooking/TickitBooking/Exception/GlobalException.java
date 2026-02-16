package com.tickitbooking.TickitBooking.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(InvalidPaymentException.class)
	public ResponseEntity<ErrorResponse> duplicateRequestException(InvalidPaymentException ex) {
		ErrorResponse re = new ErrorResponse();
		
		re.setStatuscode(123);
		re.setMessage(ex.getMessage());
		re.setTime(LocalDateTime.now());
		re.setTrace(ex.getStackTrace()[0].toString());
		return new ResponseEntity<ErrorResponse>(re,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
