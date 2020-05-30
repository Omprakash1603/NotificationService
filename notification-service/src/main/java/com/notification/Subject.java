package com.notification;

public interface Subject {

	public void registerObserver(Observer o);

	public void unregisterObserver(Observer o);

	public void notifyUpdate(Message m);

	public ApplicationName getSubjectName();

}
