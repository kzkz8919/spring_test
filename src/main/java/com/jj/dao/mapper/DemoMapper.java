package com.jj.dao.mapper;

import java.util.List;

import com.jj.dao.domain.Demo;

public interface DemoMapper {

	void add(Demo demo);
	
	List<Demo> findByNameAndMobile(Demo demo);
	
	void update(Demo demo);
	
	void delete(Integer id);
	
}
