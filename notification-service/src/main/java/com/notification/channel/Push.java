package com.notification.channel;

import com.notification.Message;

public class Push implements Channel {

	@Override
	public void add(Message m) {
		System.out.println("       => Push Notification :: " + m.getMessageContent());
	}

}
