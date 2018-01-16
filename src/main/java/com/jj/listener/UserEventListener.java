package com.jj.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.jj.event.UserEvent;

@Component
public class UserEventListener implements ApplicationListener<UserEvent>{

	public void onApplicationEvent(UserEvent userEvent) {
		userEvent.testUserEvent();
	}
}
