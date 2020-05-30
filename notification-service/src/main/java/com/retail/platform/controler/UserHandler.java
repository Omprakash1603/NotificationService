package com.retail.platform.controler;

import java.util.HashMap;
import java.util.Map;

import com.notification.ApplicationName;
import com.notification.Message;
import com.notification.Netflix;
import com.notification.Subject;
import com.notification.Youtube;
import com.notification.factory.UserFactory;
import com.notification.user.User;

public class UserHandler {
	public static Map<ApplicationName, Subject> subjectToObserversMap = new HashMap<ApplicationName, Subject>();

	public static void subscribeUsers() {
		User u1 = UserFactory.getUser(UserFactory.SILVER_PLAN);
		User u2 = UserFactory.getUser(UserFactory.GOLD_PLAN);
		User u3 = UserFactory.getUser(UserFactory.PREMIUM_PLAN);

		Youtube youtubeChannel = new Youtube();
		youtubeChannel.registerObserver(u1);
		youtubeChannel.registerObserver(u2);

		subjectToObserversMap.put(youtubeChannel.getSubjectName(), youtubeChannel);

		// u1 and u2 will receive the update
//		youtubeChannel.notifyUpdate(new Message("video uploaded"));

		// u2 and u3 will get the update
//		youtubeChannel.unregisterObserver(u1);
//		youtubeChannel.registerObserver(u3);
//		youtubeChannel.notifyUpdate(new Message("War on Youtube")); 

		Netflix netflixChannel = new Netflix();
		netflixChannel.registerObserver(u1);
		netflixChannel.registerObserver(u3);
		subjectToObserversMap.put(netflixChannel.getSubjectName(), netflixChannel);

	}

}
