package com.springmvc.exceptions;

public class ImageUploadException extends RuntimeException {

	private String message;
	
	public ImageUploadException(String message){
		this.message=message;
	}
	
	public String getMessage(){
		return message;
	}
}
