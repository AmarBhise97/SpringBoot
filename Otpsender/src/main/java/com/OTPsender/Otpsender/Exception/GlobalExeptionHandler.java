package com.OTPsender.Otpsender.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExeptionHandler {
	
	@ExceptionHandler(InvalidOtpException.class)
	public ResponseEntity<ErrorResponse> invalidotp(InvalidOtpException ex){
		ErrorResponse er=new ErrorResponse();
		er.setMessage(ex.getMessage());
		er.setStatuscode(400);
		er.setTime(LocalDateTime.now());
		er.setStacktrace(ex.getStackTrace()[0].toString());
		
		return new ResponseEntity<ErrorResponse>(er,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(OtpExpireException.class)
	public ResponseEntity<ErrorResponse> otpexpire(OtpExpireException ex){
		ErrorResponse er=new ErrorResponse();
		er.setMessage(ex.getMessage());
		er.setStatuscode(410);
		er.setTime(LocalDateTime.now());
		er.setStacktrace(ex.getStackTrace()[0].toString());
		
		return new ResponseEntity<ErrorResponse>(er,HttpStatus.GONE);
	}

}
