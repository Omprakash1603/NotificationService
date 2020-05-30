package com.retail.platform.exception;

public class ContentException extends Exception {

	private static final long serialVersionUID = 1L;

	ExceptionType exceptionType;

	public ContentException(ExceptionType exceptionType) {
		super(exceptionType.getMessage());
		this.exceptionType = exceptionType;
	}

	public ExceptionType getExceptionType() {
		return exceptionType;
	}
}
