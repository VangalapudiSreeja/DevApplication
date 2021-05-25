package com.app.dca.exception;

public class UnknownResponseException extends Exception {
	
	private int httpStatus;
	private String exceptionMsg;
	public UnknownResponseException() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public UnknownResponseException(int httpStatus, String exceptionMsg) {
		super();
		this.httpStatus = httpStatus;
		this.exceptionMsg = exceptionMsg;
	}
	public int getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getExceptionMsg() {
		return exceptionMsg;
	}
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
	
	public UnknownResponseException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}
	public UnknownResponseException(String message, Throwable cause) {
		super(message, cause);
		
	} 
	public UnknownResponseException(String message) {
		super(message);
		
	}
	public UnknownResponseException(Throwable cause) {
		super(cause);
	}
	
	
} //end class
