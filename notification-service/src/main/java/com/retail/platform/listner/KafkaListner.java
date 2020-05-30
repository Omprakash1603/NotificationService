package com.retail.platform.listner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.notification.ApplicationName;
import com.notification.Message;
import com.notification.Subject;
import com.notification.factory.SubjectFactory;
import com.notification.factory.UserFactory;
import com.notification.user.User;
import com.retail.platform.controler.SubscriptionHandler;
import com.retail.platform.controler.UserHandler;
import com.retail.platform.model.Content;
import com.retail.platform.model.Subscription;

@Service
public class KafkaListner {

	@Autowired
	SubscriptionHandler subscriptionHandler;

	@KafkaListener(topics = "${kafka.topic.name.content}", groupId = "group_json", containerFactory = "kafkaListnerContainerFactoryContent")
	public void consumeContent(Content content) {
		String contentName = content.getContentName();
		ApplicationName chName = content.getChannelName();
		System.out.println("Notification Listner....... > Content Consumed:" + content);

//		UserHandler.subscribeUsers();
//		Subject subject = UserHandler.subjectToObserversMap.get(chName);

		// fetch all subscribers
		List<Subscription> subscriptions = subscriptionHandler.getSubscriptionByChannelName(chName);
		Subject subject = SubjectFactory.getSuject(chName);
		for (Subscription subscription : subscriptions) {
			User user = UserFactory.getUser(subscription.getPlan());
			subject.registerObserver(user);
		}

		// call Sender module
		Message msg = new Message(contentName);
		if (subject != null) {
			subject.notifyUpdate(msg);
		} else {
			System.out.println("No user registered for the Channel: " + chName);
		}
	}

}
