package com.retail.platform.exception;

public enum ExceptionType {
	EMAIL_NOT_FOUND("Sorry, No users found for this channel"),
	EMAIL_ALREADY_EXIST("Sorry, User with this email-id already exist"),
	NAME_IS_EMPTY("Sorry, User's name can not be empty"), EMAIL_IS_EMPTY("Sorry, User's email can not be empty");

	private ExceptionType(String message) {
		this.message = message;
	}

	String message;

	public String getMessage() {
		return message;
	}
}
