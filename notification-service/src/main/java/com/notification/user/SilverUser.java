package com.notification.user;

import java.util.Arrays;
import java.util.List;

import com.notification.Message;
import com.notification.channel.Channel;
import com.notification.channel.SMS;

public class SilverUser implements User {
	private List<Channel> channels = Arrays.asList(new SMS());

	@Override
	public void update(Message m) {
		System.out.println("Silver User :: " + m.getMessageContent());
		for (Channel ch : channels) {
			ch.add(m);
		}
	}

}
