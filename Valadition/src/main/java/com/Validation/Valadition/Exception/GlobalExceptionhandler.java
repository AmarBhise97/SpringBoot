package com.Validation.Valadition.Exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionhandler {
	@ExceptionHandler(DataIsEmptyException.class)
	public ResponseEntity<ErrorResponse> dataisempty(DataIsEmptyException ex){
		ErrorResponse error = new ErrorResponse();
		error.setStatuscode(300);
		error.setMessage(ex.getMessage());
		
		error.setTrace(ex.getStackTrace()[0].toString());
		error.setTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> Handleit(MethodArgumentNotValidException ex){
		
		Map<String,String> map = new HashMap<String,String>();
		 
		ex.getBindingResult().getFieldErrors().forEach(error->{
			map.put(error.getField(), error.getDefaultMessage());
		});
		return map;
		
	}

}
