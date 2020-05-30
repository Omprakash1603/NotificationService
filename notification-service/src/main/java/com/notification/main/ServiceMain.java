// References: https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/

package com.notification.main;

import com.retail.platform.controler.UserHandler;

public class ServiceMain {

	public static void main(String args[]) {
		UserHandler.subscribeUsers();
	}
}
