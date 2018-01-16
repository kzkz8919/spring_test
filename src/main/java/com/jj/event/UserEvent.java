package com.jj.event;

import org.springframework.context.ApplicationEvent;

public class UserEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	
	private Object source;
	

	public UserEvent(Object source) {
		super(source);
	
		this.source = source;
	}
	
	public void testUserEvent() {
		System.out.println(source);
	}
}
