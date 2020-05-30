package com.retail.platform.model;

import com.retail.platform.constant.ApplicationName;

public class Content {
	private String contentName;
	private ApplicationName channelName;

	public Content() {
	}

	public String getContentName() {
		return contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	public ApplicationName getChannelName() {
		return channelName;
	}

	public void setChannelName(ApplicationName channelName) {
		this.channelName = channelName;
	}

	@Override
	public String toString() {
		return "Content [contentName=" + contentName + ", channelName=" + channelName + "]";
	}

}
