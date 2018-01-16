package com.jj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jj.dao.domain.User;
import com.jj.dao.mapper.UserMapper;
import com.jj.dto.UserDto;
import com.jj.event.UserEvent;
import com.jj.utils.ResponseUtil;
import com.jj.utils.ResponseUtil.ResponseInfo;

@Service
public class UserService {
	public static Map<Integer, User> ALL_USER = new ConcurrentHashMap<Integer, User>();
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	
	public List<User> findAll() {
		return userMapper.findAll();
	}
	
	public ResponseInfo getAllUser() {
		List<User> users = new ArrayList<User>(ALL_USER.values());
		List<UserDto> dtos = new ArrayList<UserDto>();
		for (User user : users) {
			UserDto dto = new UserDto();
			dto.setId(user.getId());
			dto.setUsername(user.getUsername());
			dtos.add(dto);
		}
		
		UserEvent userEvent = new UserEvent(JSON.toJSONString(dtos));
		applicationContext.publishEvent(userEvent);
		return ResponseUtil.getSuccessResponse(dtos);
	}
	
}
