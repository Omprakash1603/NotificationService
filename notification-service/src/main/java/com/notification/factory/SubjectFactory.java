package com.notification.factory;

import com.notification.ApplicationName;
import com.notification.Hotstar;
import com.notification.Netflix;
import com.notification.Subject;
import com.notification.Youtube;

public class SubjectFactory {

	public static Subject getSuject(ApplicationName appName) {
		if (appName == ApplicationName.YOUTUBE) {
			return new Youtube();
		} else if (appName == ApplicationName.NETFLIX) {
			return new Netflix();
		} else if (appName == ApplicationName.HOTSTAR) {
			return new Hotstar();
		} else
			return null;
	}
}