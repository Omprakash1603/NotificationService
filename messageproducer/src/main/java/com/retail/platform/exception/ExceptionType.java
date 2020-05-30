package com.retail.platform.exception;

public enum ExceptionType {
	ORDER_NOT_FOUND("Sorry, No Order found with this user id"),
	ORDER_ALREADY_EXIST("Sorry, Order with this Id already exist"), NAME_IS_EMPTY("Sorry, Order name can not be empty"),
	ADDRESS_IS_EMPTY("Sorry, Order Address can not be empty");

	private ExceptionType(String message) {
		this.message = message;
	}

	String message;

	public String getMessage() {
		return message;
	}
}
