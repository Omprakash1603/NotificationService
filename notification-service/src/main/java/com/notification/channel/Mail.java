package com.notification.channel;

import com.notification.Message;

public class Mail implements Channel {

	@Override
	public void add(Message m) {
		System.out.println("       => Sending mail :: " + m.getMessageContent());
	}

}
