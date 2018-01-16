package com.jj.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.jj.schedule.UserSchedule;

public class UserListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserSchedule userSchedule;

	public void onApplicationEvent(ContextRefreshedEvent event) {

		userSchedule.doExecute();
	}
	
	
}
