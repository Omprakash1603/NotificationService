package com.retail.platform.model;

public class Response {

	private boolean successStatus;
	private String errorMsg;
	private int errorCode;
	private Content content;

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

	public Content getData() {
		return content;
	}

	public void setData(Content data) {
		this.content = data;
	}

}
