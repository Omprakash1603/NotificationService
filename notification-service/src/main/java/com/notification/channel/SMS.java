package com.notification.channel;

import com.notification.Message;

public class SMS implements Channel {

	@Override
	public void add(Message m) {
		System.out.println("       => Sending SMS :: " + m.getMessageContent());
	}

}
