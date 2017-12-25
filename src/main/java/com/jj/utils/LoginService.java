package com.jj.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.dao.domain.User;
import com.jj.dao.mapper.UserMapper;
import com.jj.utils.ResponseUtil.ResponseInfo;

@Service
public class LoginService {
	
	@Autowired
	private UserMapper userMapper;
	

	public ResponseInfo register(User user) {
		if(this.existUserName(user.getUsername())){
			return ResponseUtil.getFailedResponse("用户名已存在！");
		}
		userMapper.add(user);
		return ResponseUtil.getSuccessResponse("注册成功！");
	}
	
	private boolean existUserName(String username) {
		List<User> existInfos = userMapper.findByUsername(username);
		return (existInfos==null||existInfos.size()==0)?false:true;
	}
	
	public ResponseInfo login(User user) {
		User info = userMapper.find(user);
		if (info==null) {
			return ResponseUtil.getFailedResponse("用户名或密码不正确");
		}
		return ResponseUtil.getSuccessResponse(info);
	}
	
	
}
