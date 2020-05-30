package com.retail.platform.controler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.notification.ApplicationName;
import com.retail.platform.model.Subscription;

@RestController
@RequestMapping("/subscription")
public class SubscriptionControler {

	@Autowired
	SubscriptionHandler subscriptionHandler;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index() {
		return "Greetings from Message Producer!";
	}

	@RequestMapping(value = "/channels", method = RequestMethod.POST)
	public String addSubscription(@Valid @RequestBody final Subscription subscription) {
		return subscriptionHandler.addSubscription(subscription);
	}

	@RequestMapping(value = "/bychannelname/{name}", method = RequestMethod.GET)
	public List<Subscription> getSubscriptionByChannelName(@PathVariable("name") ApplicationName appName) {
		return subscriptionHandler.getSubscriptionByChannelName(appName);
	}

}
