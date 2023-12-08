package com.spring.boot.microservice.exception;

public class ResouceNotFoundException extends RuntimeException{

	public ResouceNotFoundException() {
		super("Resouce Not Foud On Server !!");
	}
	
	public ResouceNotFoundException(String msg) {
		super(msg);
	}
	
	
}
