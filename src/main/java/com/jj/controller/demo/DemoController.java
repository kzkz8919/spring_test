package com.jj.controller.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="demo")
public class DemoController {

	private final Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String demo(){
		logger.info("this is demo.");
		//return "/WEB-INF/jsp/test.jsp";
		return "test";
	}
}
