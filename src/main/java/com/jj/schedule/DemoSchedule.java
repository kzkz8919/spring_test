package com.jj.schedule;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoSchedule {

	
	private final Logger logger = LoggerFactory.getLogger(DemoSchedule.class);

	
	@PostConstruct
	public void demoConstruct(){
		logger.info("this is construct");
	}
	
	@Scheduled(cron="0/30 * * * * ?")
	public void doExecute(){
		logger.info("this is schedule");
	}
}
