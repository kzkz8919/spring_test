package com.jj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.annotations.LogAspect;
import com.jj.dao.domain.Demo;
import com.jj.dao.mapper.DemoMapper;



@Service
public class DemoService {
	
	@Autowired
	private DemoMapper demoMapper;
	
	@LogAspect
	public List<List<String>> getList() {
		Demo demo = new Demo();
		demo.setName("test");
		demo.setMobile("13500000000");
		demo.setAge(18);
		demoMapper.add(demo);
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
		return list;
	}
}
