package com.retail.platform.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notification.ApplicationName;
import com.retail.platform.dao.SubscriptionRepository;
import com.retail.platform.exception.SubscriptionException;
import com.retail.platform.model.Subscription;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

	@Autowired
	SubscriptionRepository subscriptionRepository;

	public Subscription addSubscription(Subscription subscription) throws SubscriptionException {
		return subscriptionRepository.save(subscription);
	}

	@Override
	public List<Subscription> getSubscriptionByChannelName(ApplicationName name) {
		return subscriptionRepository.findByChannelName(name);
	}

}
