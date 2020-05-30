package com.notification.factory;

import com.notification.user.GoldUser;
import com.notification.user.PremiumUser;
import com.notification.user.SilverUser;
import com.notification.user.User;

public class UserFactory {
	public static final String SILVER_PLAN = "Silver";
	public static final String GOLD_PLAN = "Gold";
	public static final String PREMIUM_PLAN = "Premium";

//	public static final int SILVER_PLAN = 99;
//	public static final int GOLD_PLAN = 199;
//	public static final int PREMIUM_PLAN = 500;

//	public static User registerUser(int fees) {
//		if (fees == SILVER_PLAN) {
//			return new SilverUser();
//		} else if (fees == GOLD_PLAN) {
//			return new GoldUser();
//		} else if (fees == PREMIUM_PLAN) {
//			return new PremiumUser();
//		} else
//			return null;
//	}
	public static User getUser(String plan) {
		if (SILVER_PLAN.equals(plan)) {
			return new SilverUser();
		} else if (GOLD_PLAN.equals(plan)) {
			return new GoldUser();
		} else if (PREMIUM_PLAN.equals(plan)) {
			return new PremiumUser();
		} else
			return null;
	}

}