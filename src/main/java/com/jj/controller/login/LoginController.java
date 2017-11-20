package com.jj.controller.login;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginController {
	
	private final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Map<String, Object> map){
		logger.info("this is login.");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String username, String password,Map<String, Object> map){
		logger.info("this is welcome.");
		map.put("username", username);
		return "welcome";
	}
}
