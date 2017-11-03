package com.jj.controller.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="demo")
public class DemoController {

	private final Logger logger = LoggerFactory.getLogger(DemoController.class);

	
	/*	
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String demo(Map<String, Object> map){
		logger.info("this is demo.");
		map.put("time", "current time:<br>");
		map.put("data", "this is demo:<br> hello world!");
		//return "/WEB-INF/jsp/test.jsp";
		return "test";
	}
	 */	

/*
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String demo(Map<String, Object> map){

		List<List<String>> list = new ArrayList<List<String>>();
		List<String> info1 = new ArrayList<String>();
		info1.add("a1");
		info1.add("b1");
		info1.add("c1");
		info1.add("d1");
		List<String> info2 = new ArrayList<String>();
		info2.add("a2");
		info2.add("b2");
		info2.add("c2");
		info2.add("d2");
		list.add(info1);
		list.add(info2);
		map.put("list", list);
		return "list";
	}
*/	
	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String demo(Map<String, Object> map){
		logger.info("this is map.");
		Map<String, String> m = new HashMap<String, String>();
		m.put("a", "a1");
		m.put("b", "b1");
		map.put("map", m);
		return "map";
	}
}
