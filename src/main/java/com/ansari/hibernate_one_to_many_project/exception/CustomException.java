package com.ansari.hibernate_one_to_many_project.exception;

public class CustomException extends Exception {

	String msg;
	
	public CustomException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
