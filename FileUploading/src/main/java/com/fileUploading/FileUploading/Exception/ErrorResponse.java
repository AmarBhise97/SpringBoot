package com.fileUploading.FileUploading.Exception;

import java.time.LocalDateTime;

public class ErrorResponse {
	
   int statuscode;
   LocalDateTime time;
   String message;
   String stackTrace;
   public int getStatuscode() {
	return statuscode;
   }
   public void setStatuscode(int statuscode) {
	this.statuscode = statuscode;
   }
   public LocalDateTime getTime() {
	return time;
   }
   public void setTime(LocalDateTime time) {
	this.time = time;
   }
   public String getMessage() {
	return message;
   }
   public void setMessage(String message) {
	this.message = message;
   }
   public String getStackTrace() {
	return stackTrace;
   }
   public void setStackTrace(String stackTrace) {
	this.stackTrace = stackTrace;
   }
   
   
}
