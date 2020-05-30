package com.retail.platform.controler;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notification.ApplicationName;
import com.retail.platform.model.Subscription;
import com.retail.platform.services.SubscriptionService;

@Service
public class SubscriptionHandler {

	@Autowired
	SubscriptionService subscriptionService;

	public String addSubscription(Subscription subscription) {
		subscription.setId(UUID.randomUUID());
		subscription.setChannelName(subscription.getChannelName().toUpperCase());
		try {
			subscriptionService.addSubscription(subscription);

			// for caching
			// UserHandler.subscribeUsers();
		} catch (Exception e) {
			e.printStackTrace();
			// log.error("Error occured while adding oder payload in Cassandra db ",
			// e.getMessage());
		}
		return "Not inserted";
	}

	public List<Subscription> getSubscriptionByChannelName(ApplicationName chName) {
		try {
			List<Subscription> subscription = subscriptionService.getSubscriptionByChannelName(chName);
			// log.info("Order fetched successfully from cassandra: ");
			// return returnSuccess(order.get(0), HttpStatus.OK);
			return subscription;
		} catch (Exception e) {
			// log.error("Error occured while fetching orderByCustomerName in Cassandra db
			// ", e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

}
