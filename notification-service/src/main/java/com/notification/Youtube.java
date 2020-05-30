package com.notification;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject {
	public ApplicationName subjectName = ApplicationName.YOUTUBE;

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}

	@Override
	public ApplicationName getSubjectName() {
		return subjectName;
	}

}
