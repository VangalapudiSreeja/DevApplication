package com.app.dca.exception;

public class UnknownResponseException extends Exception {
	
	private String InvalidResponse;

	public UnknownResponseException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnknownResponseException(String unknownResponse) {
		super();
		InvalidResponse = InvalidResponse;
	}

	public String getUnknownResponse() {
		return InvalidResponse;
	}

	public void setUnknownResponse(String unknownResponse) {
		InvalidResponse = unknownResponse;
	}

	

}
