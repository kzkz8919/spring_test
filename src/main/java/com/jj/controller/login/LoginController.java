package com.jj.controller.login;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jj.dao.domain.User;
import com.jj.utils.GlobalConstants;
import com.jj.utils.LoginService;
import com.jj.utils.ResponseUtil.ResponseConstants;
import com.jj.utils.ResponseUtil.ResponseInfo;



@Controller
public class LoginController {
	
	private final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Map<String, Object> map){
		logger.info("this is login.");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user, HttpSession session,Map<String, Object> map){
		logger.info("this is welcome.");
		ResponseInfo res = loginService.login(user);
		if (res.getRetCode()==ResponseConstants.SUCCESS.getRetCode()) {
			session.setAttribute(GlobalConstants.LOGIN_SESSION_KEY, res.getData());
			return "redirect:/welcome";
		}else {
			map.put("res", res);
			return "login";
		}
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User user,HttpSession session,Map<String, Object> map){
		ResponseInfo res = loginService.register(user);
		map.put("res", res);
		return "login";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(HttpSession session, Map<String, Object> map){
		logger.info("this is welcome2.");
		User user = (User) session.getAttribute(GlobalConstants.LOGIN_SESSION_KEY);
		map.put("user", user);
		return "welcome";
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session){
		session.setAttribute(GlobalConstants.LOGIN_SESSION_KEY, null);
		return "redirect:/";
		
	}
}
