package com.notification.user;

import com.notification.Message;
import com.notification.Observer;

public interface User extends Observer {

	public void update(Message m);

}
