package com.jj.controller.login;

import java.util.Map;

import javax.servlet.http.HttpSession;

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
	public String login(String username, String password,HttpSession session){
		logger.info("this is welcome.");
		session.setAttribute("username", username);
		return "redirect:/welcome";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(HttpSession session, Map<String, Object> map){
		logger.info("this is welcome2.");
		String username = (String) session.getAttribute("username");
		map.put("username", username);
		return "welcome";
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session){
		session.setAttribute("username", null);
		return "redirect:/";
		
	}
}
