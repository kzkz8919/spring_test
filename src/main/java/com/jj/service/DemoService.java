package com.jj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	public List<List<String>> getList() {
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
