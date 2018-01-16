package com.jj.schedule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.jj.dao.domain.User;
import com.jj.service.UserService;

@Component
public class UserSchedule {
	
	private final Logger logger = LoggerFactory.getLogger(UserSchedule.class);
	
	@Autowired
	private UserService userService;

/*	
	@PostConstruct
	public void init(){
		this.doExecute();
	}

	*/
	@Scheduled(cron="0/10 * * * * ?")
	public void doExecute(){
		logger.info("begin to load user table.");
		
		try {
			List<User> users = userService.findAll();
			List<Integer> newRecords = new ArrayList<Integer>();
			for (User user  : users) {
				UserService.ALL_USER.put(user.getId(), user);
				newRecords.add(user.getId());
			}
			UserService.ALL_USER.keySet().retainAll(newRecords);
		} catch (Exception e) {
			logger.error("load user table error: {}",e);
		}
		
		logger.info("end to load user table.");
		
	}
}
