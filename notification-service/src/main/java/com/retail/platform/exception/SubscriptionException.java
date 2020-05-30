package com.retail.platform.exception;

public class SubscriptionException extends Exception {

	private static final long serialVersionUID = 1L;

	ExceptionType exceptionType;

	public SubscriptionException(ExceptionType exceptionType) {
		super(exceptionType.getMessage());
		this.exceptionType = exceptionType;
	}

	public ExceptionType getExceptionType() {
		return exceptionType;
	}
}
