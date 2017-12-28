package com.jj.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jj.service.UserService;
import com.jj.utils.ResponseUtil.ResponseInfo;

@Controller
@RequestMapping(value = "/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public ResponseInfo findAllUser(){
		return userService.getAllUser();
	}
	
}
