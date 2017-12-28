package com.jj.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.dao.domain.User;
import com.jj.dao.mapper.UserMapper;
import com.jj.utils.ResponseUtil;
import com.jj.utils.ResponseUtil.ResponseInfo;

@Service
public class UserService {
	public static Map<Integer, User> ALL_USER = new ConcurrentHashMap<Integer, User>();
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> findAll() {
		return userMapper.findAll();
	}
	
	public ResponseInfo getAllUser() {
		return ResponseUtil.getSuccessResponse(ALL_USER.values());
	}
	
}
