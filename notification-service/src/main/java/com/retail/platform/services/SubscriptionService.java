package com.retail.platform.services;

import java.util.List;

import com.notification.ApplicationName;
import com.retail.platform.exception.SubscriptionException;
import com.retail.platform.model.Subscription;

public interface SubscriptionService {
	Subscription addSubscription(Subscription product) throws SubscriptionException;

	List<Subscription> getSubscriptionByChannelName(ApplicationName name);

}
