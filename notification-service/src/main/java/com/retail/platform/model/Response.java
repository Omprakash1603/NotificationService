package com.retail.platform.model;

public class Response<T> {
	private boolean successStatus;
	private String errorMsg;
	private int errorCode;
	private T data;

	public Response() {
	}

	public boolean isSuccessStatus() {
		return successStatus;
	}

	public void setSuccessStatus(boolean successStatus) {
		this.successStatus = successStatus;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
