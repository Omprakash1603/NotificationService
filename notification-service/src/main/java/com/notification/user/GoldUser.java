package com.notification.user;

import java.util.Arrays;
import java.util.List;

import com.notification.Message;
import com.notification.channel.Channel;
import com.notification.channel.Mail;
import com.notification.channel.SMS;

public class GoldUser implements User {
	private List<Channel> channels = Arrays.asList(new SMS(), new Mail());

	@Override
	public void update(Message m) {
		System.out.println("Gold User :: " + m.getMessageContent());
		for (Channel ch : channels) {
			ch.add(m);
		}
	}

}
