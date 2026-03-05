package com.fileUploading.FileUploading.Exception;

import java.nio.file.FileAlreadyExistsException;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(FileAlreadyExistsException.class)
	public ResponseEntity<ErrorResponse> File (FileAlreadyExistsException ex){
		 ErrorResponse error = new ErrorResponse();
		 error.setStatuscode(409);
		 error.setTime(LocalDateTime.now());
		 error.setMessage(ex.getMessage());
		 error.setStackTrace(ex.getStackTrace()[0].toString());
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.CONFLICT);
	}
}
